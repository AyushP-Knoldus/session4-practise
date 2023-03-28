package com.knoldus

object Main {
  def main(args: Array[String]): Unit = {
    val userNumber = scala.io.StdIn.readInt()
    val count = scala.io.StdIn.readInt()
    val result = increaseNumberCount(userNumber, count)
    println(result)
  }

  // private def increaseNumberCount(number: Int ): Int = number
  private def increaseNumberCount(number: Int, count: Int = 1): Int = number + count
}