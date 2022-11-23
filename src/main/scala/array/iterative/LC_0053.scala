package com.eureka
package array.iterative

class LC_0053:
  def maxSubArray(nums: Array[Int]): Int =
    nums.foldLeft((0, nums(0))) {
      case ((prev, res), next) => (next max prev + next, res max next max prev + next)
    }._2


