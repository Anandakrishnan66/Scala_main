import scala.io.Source
object WordCount {
  def wordCount(filePath: String, topN: Int): List[(String, Int)] = {
    val source = Source.fromFile(filePath)
    val lines = try source.getLines().toList finally source.close()
    val wordCounts = lines.flatMap(_.toLowerCase.split(" ")).filter(_.nonEmpty).groupBy(identity).mapValues(_.size).toList
    wordCounts.sortBy(-_._2).take(topN)
  }
  def main(args: Array[String]): Unit = {
    val filePath = "C:\\Users\\Administrator\\Documents\\wordcount.txt"
    val topN = 10
    val topWords = wordCount(filePath, topN)
    println(s"Top $topN frequent words in the file $filePath are:")
    topWords.foreach { case (word, count) =>
      println(s"$word: $count")
    }
  }
}
