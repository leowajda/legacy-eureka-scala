package com.eureka
package math.iterative

class LC_0509:
  def fib(n: Int): Int = n match
      case 0 | 1 => n
      case _     => (2 to n).foldLeft((0, 1)) { case ((a, b), _) => (b, a + b) }._2
