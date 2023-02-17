package com.eureka
package graph.iterative

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers.shouldBe
import org.scalatest.prop.TableDrivenPropertyChecks.{Table, forAll}

class LC_0265Test extends AnyFunSuite:

  trait Solution:
    val solution: LC_0265 = LC_0265()

  private def parameters = Table(
    ("costs",                      "expected"),
    (Array(Array(1, 5, 3), Array(2, 9, 4)), 5),
    (Array(Array(1, 3), Array(2, 4)),       5)
  )

  forAll(parameters) { (costs, expected) =>
    new Solution:

      val result = solution.minCostII(costs)
      result shouldBe expected
  }