package com.cnn.testspark

/**
  * 类似接口或者抽象类
  *
  * @author Administrator
  * @date 2020/9/26
  */
trait TestTrait {
  def test: Integer

  def test1 = {

  }
}


class Test1 extends TestTrait {
  override def test: Integer = {
    return 1
  }
}
