package OOps_Assignment_2

object Main {

  def main(args: Array[String]): Unit={


    println("enter First Person name and age")
    val Name1=scala.io.StdIn.readLine()
    val Age1=scala.io.StdIn.readInt()

    println("enter Second Person name and age")
    val Name2=scala.io.StdIn.readLine()
    val Age2=scala.io.StdIn.readInt()


      val PersonOne = new Person(Name1,Age1)
      val PersonTwo = new Person(Name2, Age2)

    if((PersonOne.Name).equals(PersonTwo.Name)){
      if((PersonOne.Age)equals(PersonTwo.Age)){
          println(true)
      }
      else {
        println(true)
      }
    }
    else if((PersonTwo.Name.length()) equals(PersonOne).Name.length())
    {
      println(true)
    }
    else {
      println(false)
    }

  }

}
