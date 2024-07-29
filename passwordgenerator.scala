import scala.util.Random
object passwordgenerator {
  def generatePassword(length: Int): String = {
    val characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()"
    (1 to length).map(_ => characters(Random.nextInt(characters.length))).mkString
  }

  def main(args: Array[String]): Unit = {
    println("Enter the desired password length:")
    val length = scala.io.StdIn.readInt()

    if (length > 0) {
      val password = generatePassword(length)
      println(s"Generated password: $password")
    } else {
      println("Password length must be greater than 0")
    }
  }
}

  