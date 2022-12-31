package com.eureka
package graph.recursive

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers.{contain, should, theSameElementsInOrderAs}
import org.scalatest.prop.TableDrivenPropertyChecks.{Table, forAll}

class LC_0797Test extends AnyFunSuite:

  trait Solution:
    val solution: LC_0797 = LC_0797()

  private def parameters = Table(
    ("graph",                                                                                                                                                                                                   "expected"),
    (Array(Array(1, 2), Array(3), Array(3), Array.emptyIntArray),                                                                                                      (0 :: 1 :: 3 :: Nil) :: (0 :: 2 :: 3 :: Nil) :: Nil),
    (Array(Array(4, 3, 1), Array(3, 2, 4), Array(3), Array(4), Array.emptyIntArray), (0 :: 4 :: Nil) :: (0 :: 3 :: 4 :: Nil) :: (0 :: 1 :: 3 :: 4 :: Nil) :: (0 :: 1 :: 2 :: 3 :: 4 :: Nil) :: (0 :: 1 :: 4 :: Nil) :: Nil)
  )

  forAll(parameters) { (graph, expected) =>
    new Solution:

      val result = solution.allPathsSourceTarget(graph)
      result should contain theSameElementsInOrderAs expected
  }