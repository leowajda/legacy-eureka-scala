package com.eureka
package array.iterative

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers.shouldBe
import org.scalatest.prop.TableDrivenPropertyChecks.{Table, forAll}

class LC_0152Test extends AnyFunSuite:

  trait Solution:
    val solution: LC_0152 = LC_0152()

  private def parameters = Table(
    ("nums",    "expected"),
    (Array(2, 3, -2, 4), 6),
    (Array(-2, 0, -1),   0),
    (Array(-2),         -2)
  )

  forAll(parameters) { (nums, expected) =>
    new Solution:

      val result = solution.maxProduct(nums)
      result shouldBe expected
  }