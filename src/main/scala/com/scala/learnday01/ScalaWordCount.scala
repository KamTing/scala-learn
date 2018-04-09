package com.scala.learnday01

/**
  * author kam
  * description  使用scala进行wordcount编码
  * date 2018/4/6
  */
object ScalaWordCount {

  def main(args: Array[String]): Unit = {

    val word = List("Hello tom hello kdjfk", "hello tom kkitty hello ")
    //先分割为list[(string,int)]
    val mapList = word.flatMap(_.split(" ")).map((_, 1))
    println(mapList)

    //分组
    val groupList = word.flatMap(_.split(" ")).map((_, 1)).groupBy(_._1)
    println(groupList)

    //对value进行size操作
    val list18 = groupList.map(x => (x._1, x._2.size))
    println(list18)

    //排序
    val list21 = list18.toList
    println(list21.sortBy(_._2).reverse)

    //使用foldLeft进行操作
    val test31 = word.flatMap(_.split(" ")).map((_, 1))
    println(test31)
    val groupMap = test31.groupBy(_._1)
    println(groupMap)

    val test36 = groupMap.mapValues(_.foldLeft(0)(_+_._2))   //0是初始值 第一个_是之前相加的值
    println(test36)

    //并行计算 使用par默认是使用电脑的cpu核数
    val list40 = Array(1, 2, 3, 4, 5)
    list40.par.sum

  }
}
