package com.eureka
package array.iterative

import scala.Tuple2

class LC_0055:
  def canJump(nums: Array[Int]): Boolean = 0 == nums.indices.foldRight(nums.length - 1) {
      (jump, prev) => if jump + nums(jump) >= prev then jump else prev
    }