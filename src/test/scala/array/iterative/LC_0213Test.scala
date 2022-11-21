package com.eureka
package array.iterative

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.*
import array.recursive.LC_0001

import org.scalatest.Inspectors.forAll
import org.scalatest.Outcome

class LC_0213Test extends AnyFunSuite with Matchers:

  trait Solution:
    val solution: LC_0213 = LC_0213()

  private def parameters = (Array(2, 3, 2),    3) ::
                           (Array(1, 2, 3, 1), 4) ::
                           (Array(1, 2, 3),    3) ::
                            Nil

  forAll(parameters) { param =>
    test(s"rob => $param") {
      new Solution:

        val (nums, expected) = param
        val result = solution.rob(nums)

        result shouldBe expected
    }
  }

