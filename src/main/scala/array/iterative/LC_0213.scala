package com.eureka
package array.iterative

import math.max

class LC_0213:

  def helper(nums: Array[Int]): Int = nums.foldLeft((0, 0)) {
    case ((a, b), c) => (b, max(b, a + c))
  }._2

  def rob(nums: Array[Int]): Int = nums.length match
    case 1 => nums(0)
    case _ => max(helper(nums.tail), helper(nums.reverse.tail))


