package com.eureka
package array.iterative

class LC_0740 {
  def deleteAndEarn(nums: Array[Int]): Int =
    val map = nums.groupMapReduce(identity)(identity) { _ + _ }

    (2 to nums.max).foldLeft((0, map.getOrElse(1, 0)))  {
      case ((prev , res), next) => (res, res max prev + map.getOrElse(next, 0))
    }._2
}

