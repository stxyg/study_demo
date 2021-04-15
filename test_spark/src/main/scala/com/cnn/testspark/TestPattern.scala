package com.cnn.testspark

import scala.util.matching.Regex

/**
  * 正则
  *
  * @author Administrator
  * @date 2020/9/26
  */
object TestPattern {
  def main(args: Array[String]): Unit = {
    val pattern = "scala".r
    val value = "scala is good"
    println(pattern findFirstIn value)


    testPattern
  }


  def testPattern = {
    val regex = new Regex("scala")
    println(regex findFirstIn "scala is ")
  }
}
