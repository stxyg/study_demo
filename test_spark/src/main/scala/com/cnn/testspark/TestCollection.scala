package com.cnn.testspark

/**
  * 集合
  *
  * @author Administrator
  * @date 2020/9/26
  */
object TestCollection {
  def main(args: Array[String]): Unit = {
    //list
    val list = List(1, 2, 3)
    println(list)


    //set
    val set = Set(2, 3, 4, 5)
    println(set)

    //map
    val map = Map("one" -> 2, "two" -> 3)
    println(map)

    //option
    val option = Option(3, 4, 5, 6)
    val some = Some(3, 4, 5)
    println(option)
    println(some)

    //不同元素的元组
    var x = (1, "33");
    println(x)
  }
}
