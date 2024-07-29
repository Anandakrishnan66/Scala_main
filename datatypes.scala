object Datatypes{
  def main(args: Array[String]): Unit = {
    val intNum: Int=20
    val longNum: Long=123321535L
    val shortNum: Short=32657
    val byteNum: Byte=127
    val stringex: String="hello"
    val floatingnum:Float=3.14f
    val doublenum:Double=2.14
    val charvar:Char='A'
    val unitval:Unit=()
    println(s"Integer:$intNum")
    println(s"Long:$longNum")
    println(s"String:$stringex")
    println(s"Unit:$unitval")
    println(s"Char:$charvar")
    println(s"Floating:$floatingnum")
    println("ditto : "+doublenum)
    //Mutable data types
    //boolean - true,false
    var boolvar: Boolean=true
    println("Boolean"+boolvar)
    var intVar: Int=4241
    println("Integer variable:"+intVar)
    //update item assigment in muttable variable
    intVar = intVar+1000
    println("Updated value="+intVar)
//    intNum =intNum+100
  }

}
