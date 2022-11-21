package com.eureka
package array.iterative

import math.max

class LC_0198:
  def rob(nums: Array[Int]): Int = nums.foldLeft((0, 0)) {
    case ((a, b), c) => (b, max(b, a + c))
  }._2
