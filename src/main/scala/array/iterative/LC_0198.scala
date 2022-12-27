package com.eureka
package array.iterative

import scala.math.max

class LC_0198:
  def rob(nums: Array[Int]): Int = nums.foldLeft((0, 0)) {
    case ((prev, res), house) => (res, res max prev + house)
  }._2
