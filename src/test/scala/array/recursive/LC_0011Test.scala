package com.eureka
package array.recursive

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers.shouldBe
import org.scalatest.prop.TableDrivenPropertyChecks.{Table, forAll}

class LC_0011Test extends AnyFunSuite:

  trait Solution:
    val solution: LC_0011 = LC_0011()

  private def parameters = Table(
    ("height",                 "expected"),
    (Array(1,8,6,2,5,4,8,3,7),         49),
    (Array(1,1),                        1)
  )

  forAll(parameters) { (height, expected) =>
      new Solution:

        val result = solution.maxArea(height)
        result shouldBe expected
  }
