package com.eureka
package array.iterative

import scala.math.max

class LC_0152:
  def maxProduct(nums: Array[Int]): Int =
    val (lastMax, _, maxProduct) = nums.tail.foldLeft((nums.head, nums.head, nums.head)) {
      case ((prevMax, prevMin, maxProduct), num) =>
        (List(num, num * prevMax, num * prevMin).max, List(num, num * prevMax, num * prevMin).min, maxProduct max prevMax)
    }
    lastMax max maxProduct
