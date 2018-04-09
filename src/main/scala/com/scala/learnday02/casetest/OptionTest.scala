package com.scala.learnday02.casetest

/**
  * @author kam
  * @description
  * @date 2018/4/7
  */
object OptionTest {

  def main(args: Array[String]): Unit = {

    val mapTest = Map("kam"->1, "chloe"->2)
    mapTest.get("kam") match {  //option
      case Some(i) => i
      case None => 0
    }

    //更好的方式

    val tt = mapTest.getOrElse("ll", "121")
  }
}
