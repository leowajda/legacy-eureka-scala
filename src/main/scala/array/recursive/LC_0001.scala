package com.eureka
package array.recursive

import scala.annotation.tailrec

class LC_0001:
  def twoSum(nums: Array[Int], target: Int): Array[Int] =

    @tailrec
    def helper(pos: Int = 0, map: Map[Int, Int]): Array[Int] =
      map.get(target - nums(pos)) match
        case Some(value) if value != pos  => Array(value, pos)
        case _                            => helper(pos + 1, map)

    helper(map = nums.zipWithIndex.toMap)





