object DataStructures {
  def main(args: Array[String]): Unit = {
    //List: Immutable,Homogenouus collection of daata
    val array:List[Any]=List("Astro","Kdot","Metro")
    println("The first element is "+array.head)//first element is displayed
    println("The elements of the list excluding the last element"+array.tail)
    println("The last element is"+ array.last)
    println("The List is "+array)
    val List1 = List("Hadoop","Spark","MapReduce","Flume","Pyspark",1000,true,3.14,3/14)
    println(List1)
    println(List1.getClass)
    //Empty List Declaration
    val emptyList: List[Nothing]=List()
    //List declaration
    val list2=10::20::30::40::Nil

    println(emptyList)
    //Array Data type
    val arrayData=Array("Astro","Kdot","Metro")
    //prints element by element output in new line
    arrayData.foreach(println)
    //printing all values
    println(arrayData.mkString(","))
    arrayData(0)="PassionFruit"
    println(arrayData.mkString("|"))
    //declare an empty array
    var a=new Array[String](10)
    val a2=Array.ofDim[Int](4,4)
    a2(0)(0)=234
    a2(0)(1)=214
    a2(1)(0)=87
    a2(1)(1)=96
    //print the array
    val flattenArr:Array[Int]=a2.flatten
    println(flattenArr.mkString(","))
    println(list2)
    //create a List buffer of type mutable
    import scala.collection.mutable.ListBuffer
    var cities=new ListBuffer[String]()
    cities+="Kollam"
    cities+="Kochi"
    cities+="Alapuzzha"
    cities+="Thiruvananthapuram"
    cities+=("Kozhikode","Kazargode")
    cities-="Kazargode"
    var citylist=cities.toList//Typecasting in scala is done by toDatatype
    println(citylist)
    var cityset=cities.toSet
    println(cityset)
    println(cities)
    //SET COLLECTIONS:Immutable collection
    //HashSet - Mutable Collection of sets
    val set:Set[String]=Set("sussy","barker")
    val set_1=Set(1,2,3,5)
    println(set)
    println(set_1)
    import scala.collection.mutable.Set
    //to import the hash set
    val muset=Set("sussy","barker")
    muset+="blueberry"
    muset-="sussy"
    println(muset)
    //Tuple declaration in Scala-Immutable
    //in scala tuple is fixed size, can hold multiple data types
    val tuple_1=(10,20,30,40,50,60,70,80)
    println(tuple_1)
    //tuple_1._1="String" Update will provide error,
    println(tuple_1._2)//accessing individual value(2nd Element)
    //in tuple the indexing starts from 1 instead of 0 in array
    //Map in Scala is collection of key-value pairs where each
    //key is unique it is similar to dictionary in python
//    import scala.collection.immutable.Map
    //import sala.collection.mutable.Map to go back to mutable form
    var A:Map[String,Int]=Map("Blue"->34,"Red"->21)
    var Map1=Map("UST001"->"Adnan","UST002"->"Mandan","UST003"->"Vinesh","UST004"->"Adinan")
    println(Map1.contains("UST002"))
    //Access value using keys
    println(Map1.get("UST002"))
    println(A)
    //Print all keys
    println(Map1.keys)
    //Print all values
    println(Map1.values)
    //Declare mutable map Data types
    import scala.collection.mutable.Map

    val mumap=Map("UST001"->"Adnan","UST002"->"Mandan","UST003"->"Vinesh","UST004"->"Adinan")
    //Insert new key value pair
    mumap("UST005")="Rohit"
    //Update existing key
    mumap+=("UST005"->"Shaaz")
    println(mumap("UST005"))
    //Iterators in Scala programming
    //An iterator in scala represents a sequence of element
    //that allows you to traverse through a collection
    //sequentially.
    val myList=List(20,30,40,50,60,70,80,90)
    val iter=myList.iterator
    //methods of iterator to check if there is more elements
    //(.hasNext())
    //to retrieve the next element there is (.next())
    //to remove the element(.remove()) -to remove elements
    //from mutable iterators
    println(iter.next())
    println(iter.next())
    //Lazy initialization using Scala
    lazy val donuts:Int=100
    println(donuts * 5)
    //lazy can't be used with var, it can only be used
    //with val
//    lazy var donuts_1:Int =20


  }


}
