object DataStructureMethods{
  def main(args: Array[String]): Unit = {
    //List & Methods
    val list_1 = List("apple","grapes","cherry","oranges","watermelon")
    //empty list
    val list2=List()
    //basic operations
    val firstelement = list_1.head
    val restoflist = list_1.tail
    val lastelement = list_1.last
    val secondelement = list_1(1)
    println("Second element is "+secondelement)
    //check if list or collection is empty
    val islistempty=list_1.isEmpty
    println(islistempty)
    //get the size of the collection
    val length = list_1.length
    println(length)
    //Adding and removing elements from the list
    val list_2 = List(1,2,3,4,5,6,7,8)
    //Append to the beginning of the list
    val newList= 0 :: list_2
//    println(newList)
    //Append to the last position of the list
    val appendList =list_2:+ 9
//    println(appendList)
    //Concatenation between two list
    val concatList = list_2 ::: List(9,10,11,12)
    val concatList1 = list_2 ++ List(9,10,11,12)
//    println(concatList)
//    println(concatList1)
    //Removing or Dropping values from List
    //drop 3 values from start of list
    concatList.drop(3)
    //remove specific values by using boolean condition
    val updatedList = concatList.filter(_ !=4)
//    println(updatedList)
    //remove a batch of values from the list
    val updatedList1= concatList.diff(List(3,4,5))
//    println(updatedList1)
    //Transforming Lists
    //Map is used to do one function to all the elements in the list
    println(list_2.map(_ *2))
    //Filter is used to filter the values of the list based on specific conditions
    println(list_2.filter(_%2==0))
    //Creating a nested List
    val nestedList=List(List(1,2,3),List(4,5,6),List(7))
    println(nestedList)
    //To convert nested List to one dimensional list
    val flatList = nestedList.flatMap(identity)
//    println(flastList)
    //To add elements in the list. It is an aggregate operation
    val sum=flatList.reduce(_ * _)
    //slicing and subsets of list
    println(list_1.take(3))//takes first three elements
    list_1.takeRight(3)//Last three elements
    list_1.dropRight(2)//without last two elements
    println(list_1.slice(1,4))//Start value:1,end value:3
    //Converting list to Map
    val listofTuples=List(("UST1001","Krishna"),("UST1002","Rohit"),("UST1003","Adnan"))
    val map=listofTuples.toMap
    println(map)
    //Zipping or combining two lists
    val zippedList=list_1.zip(list_2)
    println(zippedList)
    //Unzipping a zipped list or tuple
    val (fruits,numbers)=zippedList.unzip
//    println(fruits)
//    println(numbers)
    // Sets and Sets methods+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    val set1=Set(1,2,3,4,5,6,7,8)
    val set2=Set("apple","grapes","guvava","pineapple","strawberry")
    //Checks whether the specified element is present returns
    //true or false
    println(set1.contains(3))
    //Adding a value and removing elements
    println(set1+9)
    println(set1-7)
    //Set Operations
    val setA = Set(10,20,30,40)
    val setB = Set(50,60,70,30,40)
    //Union of both the sets
    val unionSet = setA union setB
    //only intersection of the sets
    val interect =setA intersect setB
    //find the difference between the set
    val diff=setA diff setB
    //find if the setB will be a subset of setA
    val subset=setA.subsetOf(setB)
    println(subset)
    println(setA.map(_*2))
    val reset=setA.reduce(_ + _)
    val filter=setA.filter(_!=40)

    println(reset)
    println(filter)
    setA.foreach(println)
    //ARRAY ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    val array1=Array("kochi","varkala","trivandrum","alappuzha")
    val array2=Array(1,2,3,4,5,6,7)
    //empty array
    val emptyarray=Array[Int]()
    //update the value at index position 0
    array2(0)=10
    import scala.collection.mutable.ArrayBuffer
    //Arrays are by default fixed size hence we need
    //array buffer
    val arraybuffer = ArrayBuffer(1,2,3,4,5,6,7)
    arraybuffer+=8
    arraybuffer-=6
    println(arraybuffer)
    arraybuffer.map(_ * 2)
    val array3=arraybuffer.toArray
    //nested array
    val nestedArray=Array(Array(2,3),Array(4,5))
    //To flatten nested Array
    val flatArray=nestedArray.flatten
    //Slicing in array
    flatArray.slice(1,5)



  }
}