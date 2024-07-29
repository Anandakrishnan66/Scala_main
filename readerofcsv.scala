import scala.io.Source
object readerofcsv{
  def main(args:Array[String]): Unit = {
    val filepath="C:\\Users\\Administrator\\Downloads\\Country.csv"
    val source=Source.fromFile(filepath)
    val lines=source.getLines().toList
    source.close()
    val words=lines.flatMap(_.split(",")).map(_.toLowerCase).map(_.trim)
    val header=lines.head
    val body=lines.tail.map(_.trim)
    val handledbody=body.map{row=>row.map{wor=>if wor.isEmpty then "null" else wor}
    println(handledbody)
    println(header)
    println(body)
    words.foreach{ word=>println(f"The words are ${word}")
    }
    val wordcount=words.length
    println(wordcount)
  }
}