package com.eureka
package graph.recursive

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers.shouldBe
import org.scalatest.prop.TableDrivenPropertyChecks.{Table, forAll}

class LC_0841Test extends AnyFunSuite:

  trait Solution:
    val solution: LC_0841 = LC_0841()

  private def parameters = Table(
    ("rooms",                                                              "expected"),
    ((1 :: Nil) :: (2 :: Nil) :: (3 :: Nil) :: Nil :: Nil,                       true),
    ((1 :: 3 :: Nil) :: (3 :: 0 :: 1 :: Nil) :: (2 :: Nil) :: (0 :: Nil) :: Nil, false)
  )

  forAll(parameters) { (rooms, expected) =>
    new Solution:

      val result = solution.canVisitAllRooms(rooms)
      result shouldBe expected
  }