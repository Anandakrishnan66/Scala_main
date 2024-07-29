//Collection Map
object map{
  def main(args:Array[String]): Unit = {
    val immutableMap=Map("a"->1,"b"->2,"c"->3,"d"->4,"e"->5)
    import scala.collection.mutable
    val mutableMap = mutable.Map("a"->1,"b"->2,"c"->3,"d"->4,"e"->5)
    println(immutableMap.contains("a"))//to check if the map contains the
    //value returns true or false
    println(immutableMap("a"))//to access the value
    //Concatenation
    val mapA=Map("a"->1,"b"->2,"c"->3)
    val mapB=Map("b"->3,"d"->4,"e"->5,"f"->6)
    val concatMap=mapA++mapB
    println(concatMap)
    //Transforming keys and values
    val incrementValue=immutableMap.mapValues(_ + 1)
    val transformkey=immutableMap.map{case(k,v)=>(k.toUpperCase(),v+10)}
    incrementValue.foreach {
      case (key, value) => println(s"{$key},$value")
    }
    transformkey.foreach{
      case(key,value)=>println(s"$key:$value")
    }
    for(k<-transformkey){
      println(k)
    }

  }
}