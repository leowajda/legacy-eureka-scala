package com.eureka
package array.recursive

import scala.annotation.tailrec

class LC_0069:
  def mySqrt(x: Int): Int =

    @tailrec
    def helper(left: Long, right: Long, guess: Long): Int = left > right match
      case false  => left + (right - left) / 2 match
        case middle if middle * middle <= x => helper(middle + 1, right, middle)
        case middle                         => helper(left, middle - 1, guess)
      case true  => guess.toInt

    helper(0, x, -1)

