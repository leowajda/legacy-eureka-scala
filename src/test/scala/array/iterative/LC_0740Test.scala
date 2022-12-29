package com.eureka
package array.iterative

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers.shouldBe
import org.scalatest.prop.TableDrivenPropertyChecks.{Table, forAll}

class LC_0740Test extends AnyFunSuite:

  trait Solution:
    val solution: LC_0740 = LC_0740()

  private def parameters = Table(
    ("nums",                  "expected"),
    (Array(3, 4, 2),                   6),
    (Array(2, 2, 3, 3, 3, 4),          9)
  )

  forAll(parameters) { (nums, expected) =>
    new Solution:

      val result = solution.deleteAndEarn(nums)
      result shouldBe expected
  }
