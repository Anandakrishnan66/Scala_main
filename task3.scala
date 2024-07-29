import scala.io.Source
object task3 {
  def main(args: Array[String]): Unit = {
    val filepath = "C:\\Users\\Administrator\\Downloads\\StatewiseGDP.csv"
    val source = Source.fromFile(filepath)
    val lines = source.getLines().toList
    var datas=lines.map{line=>line.split(",").map(_.trim).toList}
    println(datas)
    datas=datas.tail

//    var datas:List[String]=List()
//    for(line<-lines){
//      datas =line
//    }
    print(datas)
    source.close()
    val seperatedlines = lines.flatMap(_.split(",").map(_.trim)).toList
    println(seperatedlines)
    val States = seperatedlines.sliding(3, 3).map(_.head).toList
//    println(States)
    val gdp = seperatedlines.map(_(1).toDouble)
    val per_capita = seperatedlines.map(_(2).toInt)
    //1.find the state with the highest GDP contribution

//    val trueGDP= gdp.tail
//    //    println(trueGDP.max)
//    val trueStates = States.tail
//    val truePerCapita = per_capita.tail
//    val maxindex = trueGDP.indexOf(trueGDP.max)
//    println("The state with the max GDP is " + trueStates(maxindex) + " having GDP of " + trueGDP.max)
//    //2.Find average GDP per capita
//
//    println(trueGDP)


  }
}
