package com.eureka
package graph.iterative

import scala.math.min

class LC_0256:
  def minCost(costs: Array[Array[Int]]): Int =
    costs.foldLeft(0 :: 0 :: 0 :: Nil) {
      case (minRed :: minGreen :: minBlue :: Nil, Array(red, green, blue)) =>
        red + min(minGreen, minBlue) :: green + min(minRed, minBlue) :: blue + min(minRed, minGreen) :: Nil
    }.min


