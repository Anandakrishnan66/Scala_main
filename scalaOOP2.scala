class circle (val radius: Double){
  def area:Double = Math.PI * radius * radius
  def circumference: Double = 2* Math.PI*radius
}
object circle{
  def apply(radius: Double):circle = new circle(radius)
}
object CompanionObj extends App{
  //create an instance using companion object
  var circl =circle(6.0)
  println(circl.area)
  println(circl.circumference)
}