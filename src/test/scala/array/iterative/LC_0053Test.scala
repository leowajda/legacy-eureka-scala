package com.eureka
package array.iterative

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers.shouldBe
import org.scalatest.prop.TableDrivenPropertyChecks.{Table, forAll}

class LC_0053Test extends AnyFunSuite:

  trait Solution:
    val solution: LC_0053 = LC_0053()

  private def parameters = Table(
    ("nums",                               "expected"),
    (Array(-2, 1, -3, 4, -1, 2, 1, -5, 4),         6),
    (Array(1),                                     1),
    (Array(5, 4, -1, 7, 8),                        23),
    (Array(-2),                                   -2)
  )

  forAll(parameters) { (nums, expected) =>
      new Solution:

        val result = solution.maxSubArray(nums)
        result shouldBe expected
  }