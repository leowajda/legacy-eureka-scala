package com.eureka
package math.iterative

class LC_0509:
  def fib(n: Int): Int =
    lazy val fibs: LazyList[Int] = 0 #:: 1 #:: fibs.zip(fibs.tail).map{ (a, b) => a + b }
    fibs.take(n + 1).last