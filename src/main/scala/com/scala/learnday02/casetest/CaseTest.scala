package com.scala.learnday02.casetest

/**
  * author kam
  * description
  * date 2018/4/7
  */
object CaseTest {

  def main(args: Array[String]): Unit = {

    val testList = Array("kamding", "chloe", "maomao")

    testList match{
      case Array() => println(1321)
      case _ => println("nofind")
    }
  }
}
