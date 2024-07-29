import scala.io.StdIn
object arrayassigment{
  def main(args: Array[String]): Unit = {
    println("Enter the size of array")
    val n=StdIn.readInt()
    val arr=new Array[String](n)
    println("Enter the elements of the array")
    for(i <- 0 to (n-1)){
      val str=StdIn.readLine()
      arr(i)=str
//      val array4 = Array(2, 5, 1, 6, 3, 2, 8)
    }
//    for (elem <- arr) {println(elem)}
    val vowels=Array('a','e','i','o','u')
    var garr=arr.groupBy{ch=>if(vowels.contains(ch.charAt(0).toLower)) "Vowels" else "consonants"}
    garr.foreach {
      case(key,value)=>println(s"$key: ${value.mkString(",")}")
    }
  }
}