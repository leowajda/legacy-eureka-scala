package com.eureka
package array.iterative

import scala.math.max

class LC_0198:
  def rob(nums: Array[Int]): Int = nums.foldLeft((0, 0)) {
    case ((maxRobbery, prevRobbery), house) => (maxRobbery max (prevRobbery + house), maxRobbery)
  }._1
