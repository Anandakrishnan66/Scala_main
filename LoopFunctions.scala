object LoopFunctions {
  def main(args: Array[String]): Unit = {
    //do-while loop
    var j = 1

    //    do {
    //      println(j)
    //      j+=1
    //    } while(j<=5)
    //  }
    def factorial(num: Int): Int = {
      if (num == 0) 1
      else num * factorial(num - 1)
    }

    println(factorial(6))
  }
}