package com.eureka
package array.iterative

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers.shouldBe
import org.scalatest.prop.TableDrivenPropertyChecks.{Table, forAll}

class LC_0055Test extends AnyFunSuite:

  trait Solution:
    val solution: LC_0055 = LC_0055()

  private def parameters = Table(
    ("nums",               "expected"),
    (Array(2, 3, 1, 1, 4),       true),
    (Array(3, 2, 1, 0, 4),      false)
  )

  forAll(parameters) { (nums, expected) =>
      new Solution:

        val result = solution.canJump(nums)
        result shouldBe expected
  }
