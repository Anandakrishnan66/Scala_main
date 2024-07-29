//Inheritance - Example demonstrate inheritance, where a subclass
//subclass (child class) extends a superclass (Parent Class)
class Animal(val name:String){
  def makeSound():Unit ={
    println(s"$name says kalla kadayadi mwone")
  }
}
//Subclass
class Dog(name:String) extends Animal(name) {
  override def makeSound(): Unit = {
    println(s"$name says Woof")
  }
}
class Cat(name:String) extends Animal(name){
  override def makeSound(): Unit = {
    println(s"$name says meow")
  }
}
object InheritObj extends App{
  val animal=new Animal("Ananda Krishnan")
  animal.makeSound()
  val dog=new Dog("Charlie")
  dog.makeSound()
  val cat=new Cat("Jeorgie")
  cat.makeSound()
}