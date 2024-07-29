import scala.io.StdIn
import scala.collection.mutable.Map
object task4{
  def main(args:Array[String]): Unit = {
    var empMap:Map[String,Integer]=Map()
    println("Enter the number of employees to be added")
    var n=StdIn.readInt()
    for(i<-0 to n){
      println("Enter the employee Name: ")
      var empName=StdIn.readLine()
      println("Enter the employee Salary:")
      var empSal=StdIn.readInt()
      empMap+=(empName->empSal)
    }
    var total=0
    empMap.foreach {
      case(k,v)=>(total=total+v)
    }
    val toten=total*0.1
    var empList=empMap.toList
    val (lowsal,highsal)=empList.partition(_._2<toten)
    println("The higher salary is "+highsal)
    println("The lower salary is "+lowsal)
  }
}