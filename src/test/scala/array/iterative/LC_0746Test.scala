package com.eureka
package array.iterative

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers.shouldBe
import org.scalatest.prop.TableDrivenPropertyChecks.{Table, forAll}

class LC_0746Test extends AnyFunSuite:

  trait Solution:
    val solution: LC_0746 = LC_0746()

  private def parameters = Table(
    ("cost",                                  "expected"),
    (Array(1, 100, 1, 1, 1, 100, 1, 1, 100, 1),        6),
    (Array(10, 15, 20),                               15)
  )

  forAll(parameters) { (cost, expected) =>
    new Solution:

      val result = solution.minCostClimbingStairs(cost)
      result shouldBe expected
  }
