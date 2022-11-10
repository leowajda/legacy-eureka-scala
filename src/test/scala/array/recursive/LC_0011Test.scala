package com.eureka
package array.recursive

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.*
import array.recursive.LC_0001

import org.scalatest.Inspectors.forAll
import org.scalatest.Outcome

class LC_0011Test extends AnyFunSuite with Matchers:

  trait Solution:
    val solution: LC_0011 = LC_0011()


  private def parameters = (Array(1,8,6,2,5,4,8,3,7), 49) ::
                           (Array(1,1), 1)                ::
                            Nil

  forAll(parameters) { param =>
    test(s"maxArea => $param") {
      new Solution:

        val (height, expected) = param
        val result = solution.maxArea(height)

        result shouldBe expected
    }
  }
