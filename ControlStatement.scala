object ControlStatement {
  def main(args: Array[String]): Unit = {
    //Example1.if-else
    import scala.io.StdIn
    println("Enter a number: ")
    //Ask user to input and typecast it into a Integer Datatype
    //    val x1=StdIn.readInt()
    /*val x1=StdIn.readLine().toInt
    if (x1 > 0){
      print("Value is positive")
    } else if(x1 <0){
      println("Value is negative")
    } else{
      println("Value is zero")
    }
    //Example2: Using if-else as an Expression
    println("Enter a number")
    val x2=StdIn.readLine().toInt
    val output=if(x2%2==0) "even" else "odd"
    println(output)
    //Example 3.While Loop using Scala
     */
    /*var i=0.5f
    while(i<=5){
      println(s"Value of i is: $i")
      i+=0.27f
    }

     */
    //Example 4. For loop in Scala
    val List_1=List("Kerala","UST1001","Trivandrum",22,"CSE",78.897)
    for(value<-List_1){
      println(value)
    }
    // Example 5. Generating a collection of Even numbers
    val List2=(1 to 50).toList
    val List3=(2 to 100).toList
    val even=for {
        num<-List2
        if(num%2==0)
        } yield num//yield is keyword in scala which is used
    //to generate new collections from an existing one
    //Example 6.Generate a collection of prime numbers
    val prime=for{
      num<-2 to 100
      if(2 until num).forall(x=>num%x!=0)

    }yield num

    println(prime)
    //Task 1. Processing and filtering Data
    //sample record=(product name,unit price,discount,quaantity)
    //1.Filter out products that have price greater than $50
    //2.Caluclate total cost of each product
    //3.Print the name of products that has exceeded the total cost greater than 300
//    val product_1=List(List("Refrigirator",200,10,4),List("Ac",300,15,3),List("Washing Machine",130,5,2))
//    for(tem<-product_1
//    val array4=Array(3,1,5,6,2,4)



  }
}




