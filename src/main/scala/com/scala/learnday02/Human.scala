package com.scala.learnday02

/**
  * @author kam
  * @description
  * @date 2018/4/7
  */
class Human {

  var name: String = _

  //重载构造器
  def this(name: String){
    this()  //第一行先调用主构造器
    this.name = name
  }

  
}

object Human{

  def apply():Unit ={

    println("默认打印的构造")
  }
  
  def main(args: Array[String]): Unit = {

    val h = Human()  //其实就是调用了apply方法
    //等价于
    val list24 = Array(1)

    val h2 = new Human()  //调用类的默认构造器
  }
}
