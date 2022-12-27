package com.eureka
package graph.recursive

import scala.annotation.tailrec
import scala.collection.immutable.BitSet

class LC_0841:
  def canVisitAllRooms(rooms: List[List[Int]]): Boolean =

    @tailrec
    def helper(stack: List[Int], set: Set[Int], seq: IndexedSeq[List[Int]]): Set[Int] = stack match
      case head :: next => helper(seq(head).filterNot(set.contains) ++: next, set + head, seq)
      case Nil          => set

    helper(rooms.head, BitSet(0), rooms.toIndexedSeq).size == rooms.size