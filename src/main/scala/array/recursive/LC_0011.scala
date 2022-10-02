package com.eureka
package array.recursive

import scala.annotation.tailrec
import scala.math.{max, min}

class LC_0011:
  def maxArea(height: Array[Int]): Int =

    def area(left: Int, right: Int): Int = (right - left) * min(height(left), height(right))

    def next = (prev: (Int, Int)) => prev match
      case (left, right) if height(left) <= height(right) => (left + 1, right)
      case (left, right)                                  => (left, right - 1)

    @tailrec
    def helper(result: Int, indices: (Int, Int)): Int =
      val (left, right) = indices
      if left >= right then result else helper(max(result, area(left, right)), next(indices))

    helper(0, (0, height.length - 1))