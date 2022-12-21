package com.eureka
package array.iterative

import math.max

class LC_0213:
  def rob(nums: Array[Int]): Int =
    def helper(nums: Array[Int]): Int = nums.foldLeft((0, 0)) {
      case ((prev, res), house) => (res, res max prev + house)
    }._2
    
    nums.length match { case 1 => nums(0) case _ => helper(nums.tail) max helper(nums.reverse.tail) }


