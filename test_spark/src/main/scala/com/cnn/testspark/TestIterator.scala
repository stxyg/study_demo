package com.cnn.testspark

/**
  * 迭代器
  *
  * @author Administrator
  * @date 2020/9/26
  */
object TestIterator {
  def main(args: Array[String]): Unit = {
    val ints = Iterator(1, 2, 3, 4, 5)
    while (ints.hasNext) {
      println(ints.next())
    }

    //长度
    println(ints.length)
    println(ints.size)
    //最大值
    println(ints.max)
  }
}
