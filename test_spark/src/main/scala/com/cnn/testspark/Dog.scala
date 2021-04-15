package com.cnn.testspark

/**
  * @author Administrator
  * @date 2020/9/26
  */
class Dog(name: String, age: Integer) {
  var x: String = name
  var y: Integer = age

  def test(xt: Integer, yt: Integer): Integer = {
    x += xt
    y += yt

    return y
  }

}

object Test {
  def main(args: Array[String]): Unit = {
    val xxx = new Dog("xxx", 43)
    val unit = xxx.test(22, 33)

    println(unit)
  }


  class Son(name: String, age: Integer, sex: String) extends Dog(name, age) {
    var s = sex

    override def test(xt: Integer, yt: Integer): Integer = {
      
      return 1
    }
  }

}
