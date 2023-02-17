package com.eureka
package graph.iterative

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers.shouldBe
import org.scalatest.prop.TableDrivenPropertyChecks.{Table, forAll}

class LC_0256Test extends AnyFunSuite:

  trait Solution:
    val solution: LC_0256 = LC_0256()

  private def parameters = Table(
    ("costs",                                             "expected"),
    (Array(Array(17, 2, 17), Array(16, 16, 5), Array(14, 3, 19)), 10),
    (Array(Array(7, 6, 2)),                                        2)
  )

  forAll(parameters) { (costs, expected) =>
    new Solution:

      val result = solution.minCost(costs)
      result shouldBe expected
  }