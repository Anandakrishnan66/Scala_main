case class Item(id: Int, name: String, quantity: Int, price: Double, category: String)

class ShoppingCart {
  private var items: List[Item] = List()
  private val gstRate = 0.05
  private val deliveryChargeThreshold = 200.0
  private val deliveryCharge = 30.0
  def addItem(item: Item): Unit = {
    items = items :+ item
    println(s"Item added successfully: $item")
  }
  def updateItem(id: Int, updatedItem: Item): Unit = {
    val index = items.indexWhere(_.id == id)
    if (index >= 0) {
      items = items.updated(index, updatedItem)
      println(s"Item updated successfully: $updatedItem")
    } else {
      println(s"Item with id $id not found.")
    }
  }

  def removeItem(id: Int): Unit = {
    val index = items.indexWhere(_.id == id)
    if (index >= 0) {
      items = items.filterNot(_.id == id)
      println(s"Item with id $id removed successfully.")
    } else {
      println(s"Item with id $id not found.")
    }
  }

  def viewCart(): Unit = {
    if (items.isEmpty) {
      println("Your cart is empty.")
    } else {
      println("Viewing cart:")
      items.zipWithIndex.foreach { case (item, index) =>
        println(s"${index + 1}. [${item.id}] ${item.name} - Quantity: ${item.quantity}, Price: ${item.price}, Category: ${item.category}")
      }
    }
  }
  def totalPrice(withGST: Boolean = true): Double = {
    val total = items.map(item => item.price * item.quantity).sum
    val gst = if (withGST) total * gstRate else 0.0
    val delivery = if (total < deliveryChargeThreshold) deliveryCharge else 0.0
    val finalAmount = total + gst + delivery

    println(f"Cart Value: Rupees $total%.2f")
    if (delivery > 0) println(f"Delivery Charge: Rupees $delivery%.2f")
    if (gst > 0) println(f"GST: Rupees $gst%.2f")
    println(f"Amount Payable: Rupees $finalAmount%.2f")
    finalAmount
  }
}
class PaymentGateway {
  def processPayment(amount: Double, paymentMethod: String): String = {
    println(s"Processing payment of ₹$amount%.2f using $paymentMethod...")
    val confirmationNumber = s"UST${scala.util.Random.nextInt(1234567890)}"
    println(s"Payment successful! Confirmation number: $confirmationNumber")
    confirmationNumber
  }
}
object ShoppingCartApp extends App {
  val cart = new ShoppingCart()
  val paymentGateway = new PaymentGateway()

  def showMenu(): Unit = {
    println(
      """
        |Welcome to the UST Shopping Cart!
        |Please choose an option:
        |1. Add a new item
        |2. Update an existing item
        |3. Remove an item
        |4. View cart
        |5. Calculate total price
        |6. Make payment
        |7. Exit
        |Option: """.stripMargin)
  }

  def getItemDetails(id: Int): Item = {
    println("Enter item name:")
    val name = scala.io.StdIn.readLine()
    println("Enter quantity:")
    val quantity = scala.io.StdIn.readInt()
    println("Enter price:")
    val price = scala.io.StdIn.readDouble()
    println("Enter category:")
    val category = scala.io.StdIn.readLine()
    Item(id, name, quantity, price, category)
  }

  var option = 0
  var itemId = 1

  while (option != 7) {
    showMenu()
    option = scala.io.StdIn.readInt()

    option match {
      case 1 =>
        val newItem = getItemDetails(itemId)
        cart.addItem(newItem)
        itemId += 1
      case 2 =>
        println("Enter the id of the item to update:")
        val id = scala.io.StdIn.readInt()
        val updatedItem = getItemDetails(id)
        cart.updateItem(id, updatedItem)
      case 3 =>
        println("Enter the id of the item to remove:")
        val id = scala.io.StdIn.readInt()
        cart.removeItem(id)
      case 4 =>
        cart.viewCart()
      case 5 =>
        cart.totalPrice()
      case 6 =>
        val totalAmount = cart.totalPrice()
        println("Choose a payment method (Credit Card/Debit Card/UPI):")
        val paymentMethod = scala.io.StdIn.readLine()
        paymentGateway.processPayment(totalAmount, paymentMethod)
      case 7 =>
        println("Exiting the application. Thank you!")
      case _ =>
        println("Invalid option. Please choose again.")
    }
  }
}
