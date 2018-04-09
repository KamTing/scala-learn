package com.scala.learnday02

import scala.io.Source

/**
  * author kam
  * description 构造器练习
  *             跟着类的是主构造器  主构造器会在初始化对象的时候被执行
  * date 2018/4/7
  */

//sex: string不写var或者val 等价于private[this]
class People(val id: String, var name: String, sex: String, var age: Int = 18) {

  println("new People")

}

object People{   //object其实就是单例
  def main(args: Array[String]): Unit = {

    val perple = new People("123123", "chloe", "ff")
  }
}
