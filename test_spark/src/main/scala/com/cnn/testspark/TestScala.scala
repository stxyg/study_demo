package com.cnn.testspark

import java.util

/**
  * @author Administrator
  * @date 2020/9/26
  */
object TestScala {
  val b: String = "22"

  def main(args: Array[String]): Unit = {
    println("sss")

    val a = (i: Integer) => i * 12

    println(a(23))
    val str = b.concat("333")
    println(b)


  }
}
