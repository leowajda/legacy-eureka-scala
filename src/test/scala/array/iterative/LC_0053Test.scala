package com.eureka
package array.iterative

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.*

import org.scalatest.Inspectors.forAll
import org.scalatest.Outcome

class LC_0053Test extends AnyFunSuite with Matchers:

  trait Solution:
    val solution: LC_0053 = LC_0053()


  private def parameters = (Array(-2, 1, -3, 4, -1, 2, 1, -5, 4), 6) ::
                           (Array(1), 1)                             ::
                           (Array(5, 4, -1, 7, 8), 23)               ::
                           (Array(-2), -2)                           ::
                           Nil

  forAll(parameters) { param =>
    test((s"maxSubArray => $param")) {
      new Solution:

        val (nums, expected) = param
        val result = solution.maxSubArray(nums)

        result shouldBe expected
    }
  }