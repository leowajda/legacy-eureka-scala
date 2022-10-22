package com.eureka
package array.recursive

import scala.annotation.tailrec
import scala.language.postfixOps
import scala.math.{max, min}

class LC_0011:
  def area(left: Int, right: Int)(using height : Array[Int]): Int = (right - left) * min(height(left), height(right))

  def next(state: (Int, Int))(using height: Array[Int]): (Int, Int) = state match
    case (left, right) if height(left) <= height(right) => (left + 1, right)
    case (left, right)                                  => (left, right - 1)

  def maxArea(height: Array[Int]): Int =

    given Array[Int] = height

    @tailrec
    def helper(result: Int, state: (Int, Int)): Int =
      val (left, right) = state
      if left >= right then result else helper(max(result, area(left, right)), next(state))

    helper(0, (0, height.length - 1))