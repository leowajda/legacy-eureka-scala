package com.eureka
package array.recursive

import scala.annotation.tailrec

object LC_0001:
  def twoSum(nums: Array[Int], target: Int): Array[Int] =
    val map = nums.zipWithIndex.toMap

    @tailrec
    def helper(pos: Int): Array[Int] =
      val complement = target - nums(pos)

      map.get(complement) match
        case Some(value) if value != pos  => Array(value, pos)
        case _                            => helper(pos + 1)

    helper(0)





