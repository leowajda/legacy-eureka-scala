package com.eureka
package array.recursive

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.*

import org.scalatest.Inspectors.forAll

class LC_0069Test extends AnyFunSuite with Matchers:

  trait Solution:
    val solution: LC_0069 = LC_0069()


  private def parameters = List(

    (4, 2),
    (8, 2)

  )

  forAll(parameters) { param =>
    test(s"mySqrt => $param") {
      new Solution:

        val (x, expected) = param
        val result = solution.mySqrt(x)

        result shouldBe expected
    }

  }

