import scala.io.Source
class FileAnalyzer(filePath: String) {
  private val text: String = {
    val bufferedSource = Source.fromFile(filePath)
    try {
      bufferedSource.getLines().mkString("\n")
    } finally {
      bufferedSource.close()
    }
  }
  def wordCount(): Int = text.split(" ").length
  def lineCount(): Int = text.linesIterator.length
  def characterCount(): Int = text.length
  def averageWordLength(): Double = {
    val words = text.split(" ")
    if (words.length > 0) words.map(_.length).sum.toDouble / words.length else 0.0
  }
  def mostCommonStartingLetter(): Option[Char] = {
    val words = text.split(" ")
    if (words.isEmpty) None
    else {
      val startingLetters = words.map(_.head.toLower)
      startingLetters.groupBy(identity).maxBy(_._2.length)._1 match {
        case c if c.isLetter => Some(c)
        case _ => None
      }
    }
  }
  def wordOccurrences(word: String): String = " " + word + " ".r.findAllIn(text).length
}
