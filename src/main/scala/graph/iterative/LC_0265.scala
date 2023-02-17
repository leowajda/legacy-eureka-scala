package com.eureka
package graph.iterative

class LC_0265:
  def minCostII(costs: Array[Array[Int]]): Int =

    val (minCost, _) :: _ = costs.foldLeft((0, -1) :: (0, -1) :: Nil ) {
      case ((aMin, aIndex) :: (bMin, _) :: Nil, cost) => cost.zipWithIndex.map {
          case (value, index) if index != aIndex => (value + aMin, index)
          case (value, index)                    => (value + bMin, index)
        }.sortBy(_._1).take(2).toList
    }

    minCost
