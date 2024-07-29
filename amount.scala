import scala.collection.mutable
import scala.io.StdIn
import scala.collection.mutable
object amount{
  def main(args:Array[String]): Unit = {
    val note_map:mutable.Map[String,Integer]=mutable.Map("x"->2000,"y"->500,"z"->100,"xx"->50,"yy"->20,"zz"->10,"xyz"->5)
    val count_map=mutable.Map("x"->2,"y"->5,"z"->4,"xx"->30,"yy"->50,"zz"->100,"xyz"->200)
    println("Enter the amount to be withdrawn")
    val notes: mutable.ListBuffer[Integer] = mutable.ListBuffer()
    var amount = StdIn.readInt()
    for(v<-note_map.values) {
      if (amount > v) {
        notes += v
        amount = amount - v
      }


    }
    println("The notes withdrawn are:")
    notes.foreach(v=>println(v))
  }
}