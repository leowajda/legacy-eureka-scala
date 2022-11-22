package com.eureka
package array.iterative

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.*

import org.scalatest.Inspectors.forAll
import org.scalatest.Outcome

class LC_0055Test extends AnyFunSuite with Matchers:

  trait Solution:
    val solution: LC_0055 = LC_0055()

  private def parameters = (Array(2, 3, 1, 1, 4), true) ::
                           (Array(3, 2, 1, 0, 4), false) ::
                            Nil

  forAll(parameters) { param =>
    test((s"canJump => $param")) {
      new Solution:

        val (nums, expected) = param
        val result = solution.canJump(nums)

        result shouldBe expected
    }

  }
