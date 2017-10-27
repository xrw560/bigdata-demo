package cn.ncut.bigdata.scala.base

/**
  * 偏函数
  * 被包在花括号内没有match的一组case语句是一个偏函数，
  * 它是PartialFunction[A, B]的一个实例，A代表参数类型，B代表返回类型，
  * 常用作输入模式匹配
  */
object PartialFuncDemo {
  def fun1: PartialFunction[String, Int] = {
    case "one" => 1
    case "two" => 2
    case _ => -1
  }

  def fun2(num: String): Int = num match {
    case "one" => 1
    case "two" => 2
    case _ => -1
  }

  def main(args: Array[String]): Unit = {
    println(fun1("one"))
    println(fun2("two"))
  }
}
