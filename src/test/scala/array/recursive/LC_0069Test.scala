package com.eureka
package array.recursive

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers.shouldBe
import org.scalatest.prop.TableDrivenPropertyChecks.{Table, forAll}

class LC_0069Test extends AnyFunSuite:

  trait Solution:
    val solution: LC_0069 = LC_0069()
  
  private def parameters = Table(
    ("x","expected"),
    (4,           2),
    (8,           2)
  )
  
  forAll(parameters) { (x, expected) =>
      new Solution:

        val result = solution.mySqrt(x)
        result shouldBe expected
  }

