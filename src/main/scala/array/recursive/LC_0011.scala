package com.eureka
package array.recursive

import scala.annotation.tailrec
import scala.language.postfixOps
import scala.math.{max, min}

class LC_0011:
  def maxArea(height: Array[Int]): Int =

    def area = (a: Int, b: Int) => (b - a) * (height(a) min height(b))

    @tailrec
    def helper(left: Int, right: Int, result: Int = Int.MinValue): Int = left >= right match
      case true => result
      case _    => height(left) <= height(right) match
        case true => helper(left + 1, right, result max area(left, right))
        case _    => helper(left, right - 1, result max area(left, right))


    helper(0, height.length - 1)