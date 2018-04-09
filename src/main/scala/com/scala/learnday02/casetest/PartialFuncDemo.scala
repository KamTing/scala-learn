package com.scala.learnday02.casetest

/**
  * author kam
  * description
  * date 2018/4/7
  */
object PartialFuncDemo {

  def fun1: PartialFunction[String, Int] = {
    case "one" => 1
    case "two" => 2
    case _ => -1
  }

  def fun2(num: String): Int = num match {
    case "one" => 1
    case "two" => 2
    case _ => -1
  }

  def main(args: Array[String]): Unit = {

    println(fun1("one"))
    println(fun2("one"))
  }

}
