package com.eureka
package string.recursive

import scala.annotation.tailrec
import scala.collection.immutable.Queue

class LC_0022:
  def generateParenthesis(n: Int): List[String] =

    def helper(queue: Queue[String], parentheses: List[String], open: Int, close: Int): List[String] = queue.size match
      case size if size == n * 2             => queue.mkString :: parentheses
      case _    if open < n && close < open  => helper(queue :+ "(", parentheses, open + 1, close) :++ helper(queue :+ ")", parentheses, open, close + 1)
      case _    if open < n                  => helper(queue :+ "(", parentheses, open + 1, close)
      case _    if close < n                 => helper(queue :+ ")", parentheses, open, close + 1)

    helper(Queue.empty, Nil, 0, 0)

