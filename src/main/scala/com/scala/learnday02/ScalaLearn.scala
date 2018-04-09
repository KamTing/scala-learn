package com.scala.learnday02

/**
  * @author kam
  * @description
  * @date 2018/4/7
  */

//跟类名相同 伴生对象
object Person {

  def main(args: Array[String]): Unit = {

    //聚合
    val arr = List(List(1, 2, 3), List(4, 5), List(6))

    val result = arr.aggregate(0)(_+_.sum, _+_)  //_+_.sum代表是局部的求和   _+_ 代表是局部与局部之间的求和
    println(result)
    val result17 = arr.par.aggregate(0)(_+_.sum, _+_)  //_+_.sum代表是局部的求和   _+_ 代表是局部与局部之间的求和
    println(result17)   //多个list会

    val listOne = List(1, 2, 3)
    val listTwo = List(1, 4, 6)
    val union = listOne.union(listTwo)  //并集
    println(union)

    //声明对象
    val person = new Person
    println(person.id + person.name)

    println(person.testPerson("kamding"))
  }
}

private[scala] class Person private{ //private[scala] 代表类的访问权限  后面的private 代表默认的构造器是私有化的，只允许在伴生对象中使用

  val id = "1313132"

  var name = "kamding"

  private[this] var pop: String = _  //不初始化使用_ 编译器会默认初始化  //只能在person.class里面使用，需要使用的时候可以透过方法或者函数

  def testPerson(pop: String): String = pop
}
