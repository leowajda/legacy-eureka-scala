package com.eureka
package math.iterative

class LC_0070:
  def climbStairs(n: Int): Int = n match
      case 1 | 2 => n
      case _     => (3 to n).foldLeft((1, 2)) { case ((a, b), _) => (b, a + b) }._2

