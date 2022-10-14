package com.eureka
package array.recursive

import scala.annotation.tailrec

class LC_0069:
  def mySqrt(x: Int): Int =

    @tailrec
    def helper(left: Long, right: Long, guess: Long): Int =

      if left > right then
        return guess.toInt;

      val middle = left + (right - left) / 2
      if (middle * middle) <= x then helper(middle + 1, right, middle) else helper(left, middle - 1, guess)

    helper(0, x, -1)

