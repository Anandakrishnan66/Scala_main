//object scalaOOP{
//  def main(args:Array[String]): Unit = {
//
//  }
//}
//Define a class
class Car(var make:String, var model:String, var year:Int){
  def displayInfo():Unit={
    println(s"Car info: $year, $model,$make")
  }
}
object simpleClass extends App{
  val car=new Car("Toyota","Corolla",2019)
  car.displayInfo()
  //Modify the values of class
  car.year=2020
  car.model="Fortuner"
  car.displayInfo()
}