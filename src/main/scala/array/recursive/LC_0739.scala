package com.eureka
package array.recursive

import scala.annotation.tailrec
import scala.collection.immutable.ArraySeq

class LC_0739:
  def dailyTemperatures(temperatures: Array[Int]): Array[Int] =

    @tailrec
    def helper(pos: Int, stack: List[Int], seq: IndexedSeq[Int]): Array[Int] = pos match
      case pos if pos == temperatures.length   => seq.toArray
      case _                                   => stack match
        case head :: next if temperatures(pos) > temperatures(head) => helper(pos, next, seq.updated(head, pos - head))
        case prevStack                                              => helper(pos + 1, pos :: prevStack, seq)

    helper(0, Nil, Vector.fill(temperatures.length) { 0 })