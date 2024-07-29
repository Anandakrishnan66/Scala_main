import scala.io.Source
object FileAnalysis {
  def main(args: Array[String]): Unit = {
    val filePath = "C:\\Users\\Administrator\\Documents\\wordcount.txt"
    val source = Source.fromFile(filePath)
    val lines = source.getLines().toList
    source.close()
    val words = lines.flatMap(_.split(" ")).map(_.toLowerCase)
    val wordCount = words.groupBy(identity).mapValues(_.size).toSeq.sortBy(-_._2)
    println("Top 10 Most Frequent Words:")
    wordCount.take(10).foreach { case (word, count) =>
      println(s"$word -> $count")
    }
    val totalWords = words.length
    val totalCharacters = words.map(_.length).sum
    val averageWordLength = if (totalWords > 0) totalCharacters.toDouble / totalWords else 0.0
    println(f"The average length of the words is: $averageWordLength%.2f")
    val lineCount = lines.length
    println(s"Total number of lines: $lineCount")
    val characterCount = lines.map(_.length).sum
    println(s"Total number of characters: $characterCount")
    val startingLetters = words.map(_.headOption.getOrElse(' '))
    val mostCommonStartingLetter = startingLetters.groupBy(identity).maxBy(_._2.size)._1
    println(s"Most common starting letter: $mostCommonStartingLetter")
    val wordToFind = "example"
    val occurrences = words.count(_ == wordToFind.toLowerCase)
    println(s"Occurrences of '$wordToFind': $occurrences")
    source.close()
  }
}
