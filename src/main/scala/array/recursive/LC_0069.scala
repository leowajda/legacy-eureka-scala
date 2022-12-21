package com.eureka
package array.recursive

import scala.annotation.tailrec

class LC_0069:
  def mySqrt(x: Int): Int =

    @tailrec
    def helper(left: Long, right: Long, guess: Long): Int = left > right match
      case true  => guess.toInt
      case _     =>
        val middle = left + (right - left) / 2
        middle * middle <= x match
          case true  => helper(middle + 1, right, middle)
          case _     => helper(left, middle - 1, guess)

    helper(0, x, -1)

