package com.eureka
package math.iterative

class LC_0070:
  def climbStairs(n: Int): Int =
    lazy val seq: LazyList[Int] = 1 #:: 2 #:: seq.zip(seq.tail).map { (a, b) => a + b }
    seq.take(n).last

