package com.cnn.testspark

/**
  * 模式匹配
  *
  * @author Administrator
  * @date 2020/9/26
  */
object TestMatch {
  def main(args: Array[String]): Unit = {
    println(testMatch(1))
    println(testMatch(6))

  }


  def testMatch(x: Int) = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }

  def testMatch(x: Any) = x match {
    case 1 => "one"
    case 2 => 2
    case x: Int => "int"
    case _ => "many"
  }
}
