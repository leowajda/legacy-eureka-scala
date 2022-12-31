package com.eureka
package graph.recursive

import scala.annotation.tailrec

class LC_0797:
  def allPathsSourceTarget(graph: Array[Array[Int]]): List[List[Int]] =

    def helper(stack: List[Int], res: List[List[Int]]): List[List[Int]] = stack.head match
      case head if head == graph.length - 1 => stack.reverse :: res
      case head                             => graph(head).flatMap(i => helper(i :: stack, res)).toList

    helper(0 :: Nil, Nil)