  object lo {
    def main(args: Array[String]): Unit = {
      //do-while loop
      var j = 1
      //    do {
      //      println(j)
      //      j+=1
      //    } while(j<=5) while(j<=5)

      //    while(j<=5){
      //      println(j)
      //      j+=1
      //    }
      //for loop with range and step size=2
      for (i <- 1 to 10 by 2) {
        println(i)
      }
      //Iterating over a collection
      //    val fruits = List("apple","orange","cherry","strawberry")
      //    for(i<-0 to (fruits.length-1)){
      //      println(fruits(i))
      //    }
      //    for(i<-fruits){
      //      println("The fruits are "+i)
      //    }
      //Complex conditions
      import scala.io.StdIn
      //      println("Enter the temperature:")
      //      val temperature=StdIn.readLine().toInt
      //      println("Enter the humidity:")
      //      val humidity=StdIn.readInt()
      //      val weatherDesc=if(temperature>=30 & humidity>=60){
      //        "Hot and Humid"
      //      }
      //      else if(temperature>=40 & humidity<60){
      //        "Hot"
      //      }
      //      else if(humidity>70 & temperature<25){
      //        "Humid"
      //      }
      //      else {
      //        "Pleasant"
      //      }
      //      println(s"Weather is $weatherDesc")

      //    }
      //Functions in Scala Programming
      def add(a: Int, b: Int): Int = {
        a + b
      }

      def mul(a: Int, b: Int): Int = {
        a * b
      }

      //Anonymous Functions like Lambda
      val summation = (a: Int, b: Int) => a + b
      println("The summation is " +summation(5, 6))

      //Problem 1: Create a function to find the Maximum element
      //in a list
      def findMax(lst: List[Int]): Int = {
        lst.max
      }

      val numbers = List(1, 2, 3, 5, 6, 2, 5, 8, 9, 6)
      println("The maximum number in the array is " +findMax(numbers))
      println("The addition of the numbers are "+add(2,4))
      println("The product of the numbers are "+mul(2,4))

      //Recursive Function
      def factorial(num: Int):Int={
        if(num==0) 1
        else num*factorial(num-1)
      }
      val factvalue=factorial(6)
      println("The factorial is "+factvalue)
    }
  }
