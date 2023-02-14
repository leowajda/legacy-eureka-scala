package com.eureka
package array.iterative

import scala.math.max

class LC_0213:
  def rob(nums: Array[Int]): Int = 

    def helper(houses: Array[Int]): Int = houses.foldLeft((0, 0)) {
      case ((maxRobbery, prevRobbery), house) => (maxRobbery max (prevRobbery + house), maxRobbery)
    }._1

    List(nums(0), helper(nums.tail), helper(nums.reverse.tail)).max


