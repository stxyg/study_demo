package com.cnn.testspark

/**
  * 测试数组
  *
  * @author Administrator
  * @date 2020/9/26
  */
object TestArray {
  def main(args: Array[String]): Unit = {
    //数组定义1
    val integers: Array[Integer] = new Array[Integer](3)
    integers(0) = 23

    println(integers(0 / 1))
    //数组定义2
    val strings = Array("34", "34")
    println(strings(0))



    //输出所有数组
    for (elem <- strings) {
      println(elem)

    }

    for (i <- 0 to strings.length - 1) {
      println(strings(i))
    }

    for (i <- 0 until strings.length) {
      println(strings(i))
    }

    for (i <- strings.indices) {
      println(strings(i))
    }

    //计算总和
    var total = 0
    for (elem <- strings) {
      total += Integer.valueOf(elem)
    }
    println(total)


    //调用多维数组
    testMultiArray

    //数组合并
    testConcat

    //区间数组
    testRange
  }

  /**
    * 多维数组
    */
  def testMultiArray: Unit = {
    val array = Array.ofDim[Integer](3, 3)


    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        array(i)(j) = j
      }
    }

    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        println(array(i)(j))
      }
    }
  }

  /**
    * 数组合并
    */
  def testConcat: Unit = {
    val ints1 = Array.apply(1, 2, 3, 4)
    val ints2 = Array.apply(5, 6, 7, 9)
    val ints = Array.concat(ints1, ints2)
    for (elem <- ints) {
      print(elem + " ")
    }
  }

  /**
    * 区间数组
    */
  def testRange: Unit = {
    //步长1
    val range = Range.apply(10, 20)
    for (elem <- range) {
      print(elem + " ")
    }


    val range1 = Range.apply(1, 10, 2)


    for (elem <- range1) {
      print(elem + " ")
    }
  }
}
