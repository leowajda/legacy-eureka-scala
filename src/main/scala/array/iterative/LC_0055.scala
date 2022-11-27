package com.eureka
package array.iterative

class LC_0055:
  def canJump(nums: Array[Int]): Boolean = nums.indices.foldRight(nums.length - 1) {
      (b, a) => if b + nums(b) >= a then b else a
    } == 0