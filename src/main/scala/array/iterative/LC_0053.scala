package com.eureka
package array.iterative

class LC_0053:
  def maxSubArray(nums: Array[Int]): Int = nums.foldLeft((-10e4.toInt, -10e4.toInt)) {
      case ((maxSubArray, currSubArray), num) => (maxSubArray max (num max currSubArray + num), num max currSubArray + num)
    }._1
