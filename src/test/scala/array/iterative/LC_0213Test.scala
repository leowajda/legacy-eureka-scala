package com.eureka
package array.iterative

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers.shouldBe
import org.scalatest.prop.TableDrivenPropertyChecks.{Table, forAll}

class LC_0213Test extends AnyFunSuite:

  trait Solution:
    val solution: LC_0213 = LC_0213()

  private def parameters = Table(
    ("nums",            "expected"),
    (Array(2, 3, 2),            3),
    (Array(1, 2, 3, 1),         4),
    (Array(1, 2, 3),            3)
  )

  forAll(parameters) { (nums, expected) =>
      new Solution:
        
        val result = solution.rob(nums)
        result shouldBe expected
  }

