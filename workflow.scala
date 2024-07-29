object workflow{
  def main(args:Array[String]): Unit = {
    //1.Map Function
    //Map function transforms each element of a collection using given function
    val numbers = List(1,2,3,4,5,6,7,8)
    val doubleNum= numbers.map(_*2)//Multiply the list by 2
    val stringNum=numbers.map(_.toString+"numbers")
    println(stringNum)
    val nestedList = List(List(1,2,3),List(4,5,6),List(7,8))
    nestedList.flatMap(identity)
    val sentences= List("Hello scala you are awesome,scala is funny")
    val retro=sentences.flatMap(_.split(" "))
    println(retro)
  //3. Filter :It selects elements from collection that satisfy a given condition
    val shortwords=retro.filter(_.length<5)
    println(shortwords)
      //4. Fold: This combines elements of a collection using a binary operations,
    // starting with an initial value
    println("Fold value is "+numbers.fold(0)(_ + _))
    //5. Reduce: this function combines elements of collections,
    //but does not require any initial value
    val words2= List("UST","is","best")
    val sentence=words2.reduce(_+ " "+_)
    println(sentence)
    //6.Foreach - Function that applies a given procedure to each element of a collection
    words2.foreach(word => println(word.toUpperCase))
    //7.collect - the collect function applies a partial function to the element
    //of collection, returning a new collection.
    val numbers1=List(1,2,3,4,5,6,7,8,9,10)
    val oddNumber= numbers1.collect{case x if x %2 !=0=>x}
    println(oddNumber)

    val word1=List("Apple","Orange","grape","strawberry","pineapple","passion")
    val largeWords=word1.collect{case x if x.length>5=>x}
    println(largeWords)
    //8. Partition
    val (longWords,shortWords)=word1.partition(_.length<=4)
    println(longWords)
    //9.Group By= The groupby function groups a collection based on a given function
    val num = List(11,12,13,14,15,16,17,18,19)
    val even=num.groupBy(_%2==0)
    even.foreach{
      case(x,y)=>if(x==false){println(s"${y.toString()} is odd")}else{println(s"$y is even")}
    }
    //10.Scan
    //the scan function is similar to fold,but it returns a collection of
    //successive cumulative results of binary operation
    val cumsum=num.scan(0)(_ + _)
    println("The cumulative sum is : "+cumsum)
    println("The fold is : "+num.fold(0)(_+_))


  }
}