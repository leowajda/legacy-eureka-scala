package com.eureka
package array.iterative

import scala.math.min

class LC_0746:
  def minCostClimbingStairs(cost: Array[Int]): Int = {
    val minCost = (2 until cost.length).foldLeft((cost(0), cost(1))) { case ((a, b), i) => (b, cost(i) + min(b, a)) }
    min(minCost._1, minCost._2)
  }