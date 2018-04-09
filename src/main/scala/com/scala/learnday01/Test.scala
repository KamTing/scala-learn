package com.scala.learnday01

import scala.collection.mutable.{ArrayBuffer, ListBuffer, Map}

/**
  * author kam
  * description
  * date 2018/4/4
  */
object Test {

  def main(args: Array[String]): Unit = {

    //打印语句
    println("hello scala")

    //scala的for循环
    val list = Array(12,5,6)
    for (i <- list){
      println(i)
    }

    println("=====================================")
    //for
    for (i <- 1 to 3; j <- 1 to 3 if i != j){
      println(i*10 + j)
    }

    println("======================================")

    //scala的yieid
    val v = for (i <- 1 to 10) yield i * 10
    v.foreach(println)

    val test = v.map(_*10)   //对数组的每个元素进行操作 _相当于当前值
    test.foreach(println)

    println("=============遍历数组==============")
    val al = Array(1,2,3,10)
    for (i <- al)
      println(i)

    println("=============使用yieid找出数组中不是的奇数==============")
    val s = for (i <- al; if i % 2 == 0) yield i
    for (i <- s)
      println(i)

    println("=============使用filter函数进行数组过滤============")
    val kam  = Array(1,2,3,4,5,6)
    val ss = kam.filter(_ % 2 == 0)
    ss.foreach(println)

    println("============until不包换最后的边界===================")

    println("===========方法定义===========================")
    def kamding(a:Int, b:Int):Int = a * b

    println(kamding(1,2))

    println("=============函数的定义=================")
    val fun:(Int, Int) => Int = (x: Int, y: Int) => x * y  //可以显式声明参数和返回值
    val fun1= (x: Int, y: Int) => x * y  //不写参数和返回值的类型，编译器会自动推断
    println(fun(2,3))

    println("=============函数和方法的区别 方法里面可以调用函数 这样子的函数式编程可以使代码变得很灵活=====================")
    val msgList = Range(1 ,10)   //生成一个1到10的数组
    val f1 = (x: Int) => x * 10  //定义一个匿名函数 f1作为他的引用
    val f2 = (x: Int) => x + 10  //定义一个匿名函数 f2作为他的引用
    println(msgList.map(f1(_)))
    println(msgList.map(f1))

    println("=============本质上是调用了匿名函数============================")
    println(msgList.map(_ * 2))    //其实本质上调用了匿名函数

    println("==============方法和函数结合的定义=============================")
    def chloe(a:Int => Int): Int = a(3)     //方法的参数其实就是函数  方法体就是调用函数本身
    val fun3 = (x: Int) => x * 20

    println(chloe(fun3))

    println("=============方法与函数之间的互换————————————————————————")
    def d2(x: Int, y: Int): Int = x + y
    val fun4 = d2 _            //将一个方法转换为一个函数 这样可以将这个函数的引用放入方法中

    println("===============编长数组和定长数组-----------------")

    val arr1 = Array(1, 2, 3)  //定长数组
    val arr2 = ArrayBuffer(1, 2, 3)
    arr2 += 1
    println(arr2)

    //将数组翻转
    for (k <- (0 until arr2.length).reverse){
      println("下标" + k)
      println("值" + arr2(k))
    }

    //数组的排序
    val test99 = Array(1, 2, 3)
    for (i <- test99)
      print(i)

    val test100 = test99.sortBy(x => x)
    println(test100.foreach(print))
    println(test99.sorted)
    println(test99.sortWith(_>_))         //从大到小排序

    println("======================map==========================")

    //scala中的map是有可以改变和不可以改变的两种 默认是不可改变的
    val mapTest = Map("a" -> 1, "b" -> 2)
    for (i <- mapTest)
      println(i)

    mapTest("a") = 23

    for (i <- mapTest)
      println(i)

    //访问map的方式一般建议使用getOrElse 没有值的时候可以使用默认值
    println(mapTest.getOrElse("c", 45))

    val t = (1, "kamding", 4.0)
    println(t._2)   //元组获取数组的方式

    val test127, (x, y, z) = ("kamding", 12, 2.3)   //可以通过x,y,z对应获取到对应的值
    println(x)

    //对不可变数组进行操作
    val list1 = List(1, 2, 3)
    val list2 = list1.::(2)
    println(list2)

    //对两个可变的数组进行操作
    val list136 = ListBuffer(1, 2, 3)
    val list137 = ListBuffer(4, 5, 6)
    println(list136 ++= list137)   //这种形式的++会将第一个数组进行追加
    println(list136)
    println(list137)

    //数组压平操作 flatten
    val test142 = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val test143 = test142.grouped(5)
    println(test143)
    val test146 = test143.toList
    println(test146)
    println(test146.flatten)

  }

  def test(x: Int): Int = x
}
