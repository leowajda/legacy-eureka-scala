package com.eureka
package math.recursive

import java.util.function.BiFunction
import scala.annotation.tailrec

class LC_0150:

  private val ops: Map[String, BiFunction[Int, Int, Int]] = Map(
    ("+", (a, b) => a + b),
    ("-", (a, b) => a - b),
    ("*", (a, b) => a * b),
    ("/", (a, b) => a / b)
  )

  def evalRPN(tokens: Array[String]): Int =

    @tailrec
    def helper(stack: List[Int], iter: Iterator[String]): Int = iter.hasNext match
      case true  => (stack, iter.next) match
        case (b :: a :: next, token) if ops.contains(token) => helper(ops(token).apply(a, b) :: next, iter)
        case (prev, num)                                    => helper(num.toInt :: prev, iter)
      case false => stack.head

    helper(Nil, tokens.iterator)