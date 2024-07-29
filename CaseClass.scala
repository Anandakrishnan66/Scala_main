//Case Classes are special classes in Scala that are immutable
//and are compared by value. they are idea for use in pattern matching
case class Person(name: String, salary:Int)
  object CaseClass extends App {
    //create an instance of case class
    val person1 = Person("Person1", 3000)
    val person2 = Person("Person2", 5000)
    println(person1)
    println(person2)
    //copy case class
    val person3 = person1.copy(salary = 2500)
    println(person3)
    //Pattern matching in scala allows you to match values against patters
    //and excute code based on the match or the matching
    //Pattern Matching with case class
    person1 match {
      //case pattern1 => result1
      //case pattern2 => result2
      //case_ => default
      case Person(name, salary) =>
        println(s"Name:$name, Salary:$salary")
    }

}