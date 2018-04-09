package com.scala.learnday02.traitandabstract

/**
  * @author kam
  * @description
  * @date 2018/4/7
  */
class ChinesePeople extends WorldHuman with run{
  override def run(): Unit = {   //非抽象的方法重写的时候要带上override
    println("中国人running")
  }
}

object ChinesePeople{
  def main(args: Array[String]): Unit = {
    val chinesePeople = new ChinesePeople()

    chinesePeople.run()
  }
}
