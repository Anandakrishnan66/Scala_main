import scala.io.StdIn.readLine
object PayrollSystem {
  type Employee = Map[String, Any]
  def calculateSalary(employee: Employee): Double = {
    employee("type") match {
      case "FullTimeEmployee" => employee("annualSalary").asInstanceOf[Double]
      case "PartTimeEmployee" => employee("hourlyRate").asInstanceOf[Double] * employee("hoursWorked").asInstanceOf[Int]
      case "ContractEmployee" => employee("contractAmount").asInstanceOf[Double]
      case "Freelancer" => employee("projectRate").asInstanceOf[Double] * employee("projectsCompleted").asInstanceOf[Int]
      case _ => 0.0
    }
  }

  // Function to print salary details
  def printSalary(employee: Employee): Unit = {
    val salary = calculateSalary(employee)
    employee("type") match {
      case "FullTimeEmployee" =>
        println(s"${employee("name")} is a FullTimeEmployee with an annual salary of Rupees $salary")
      case "PartTimeEmployee" =>
        println(s"${employee("name")} is a PartTimeEmployee with an hourly rate of Rupees ${employee("hourlyRate")} and worked ${employee("hoursWorked")} hours. Total Salary: Rupees $salary")
      case "ContractEmployee" =>
        println(s"${employee("name")} is a ContractEmployee with a contract amount of Rupees $salary")
      case "Freelancer" =>
        println(s"${employee("name")} is a Freelancer with a project rate of Rupees ${employee("projectRate")} and completed ${employee("projectsCompleted")} projects. Total Salary: Rupees $salary")
        println(s"${employee("name")} is a Freelancer with a project rate of Rupees ${employee("projectRate")} and completed ${employee("projectsCompleted")} projects. Total Salary: Rupees $salary")
      case _ =>
        println("Unknown employee type")
    }
  }
  def getEmployeeDetails(): Employee = {
    println("Enter employee name:")
    val name = readLine()
    println("Enter employee type (FullTimeEmployee/PartTimeEmployee/ContractEmployee/Freelancer):")
    val empType = readLine()

    empType match {
      case "FullTimeEmployee" =>
        println("Enter annual salary:")
        val annualSalary = readLine().toDouble
        Map("name" -> name, "type" -> empType, "annualSalary" -> annualSalary)

      case "PartTimeEmployee" =>
        println("Enter hourly rate:")
        val hourlyRate = readLine().toDouble
        println("Enter hours worked:")
        val hoursWorked = readLine().toInt
        Map("name" -> name, "type" -> empType, "hourlyRate" -> hourlyRate, "hoursWorked" -> hoursWorked)

      case "ContractEmployee" =>
        println("Enter contract amount:")
        val contractAmount = readLine().toDouble
        Map("name" -> name, "type" -> empType, "contractAmount" -> contractAmount)

      case "Freelancer" =>
        println("Enter project rate:")
        val projectRate = readLine().toDouble
        println("Enter projects completed:")
        val projectsCompleted = readLine().toInt
        Map("name" -> name, "type" -> empType, "projectRate" -> projectRate, "projectsCompleted" -> projectsCompleted)

      case _ =>
        println("Unknown employee type")
        Map()
    }
  }
}
object PayrollApp extends App {
  import PayrollSystem.Employee

  var employees: List[Employee] = List()

  var continue = true
  while (continue) {
    println("Do you want to add a new employee? (yes/no):")
    val answer = readLine().toLowerCase
    if (answer == "yes") {
      val newEmployee = PayrollSystem.getEmployeeDetails()
      employees = employees :+ newEmployee
    } else {
      continue = false
    }
  }
  employees.foreach(PayrollSystem.printSalary)
}
