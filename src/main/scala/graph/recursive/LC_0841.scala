package com.eureka
package graph.recursive

import scala.annotation.tailrec

class LC_0841:
  def canVisitAllRooms(rooms: List[List[Int]]): Boolean =

    @tailrec
    def helper(stack: List[Int], set: Set[Int], seq: IndexedSeq[List[Int]]): Set[Int] = stack match
      case head :: next => helper(seq(head).filterNot(set.contains) ++: next, set + head, seq)
      case Nil          => set

    helper(rooms.head, Set(0), rooms.toIndexedSeq).size == rooms.size