package com.eureka
package math.iterative

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers.shouldBe
import org.scalatest.prop.TableDrivenPropertyChecks.{Table, forAll}

class LC_0070Test extends AnyFunSuite:

  trait Solution:
    val solution: LC_0070 = LC_0070()

  private def parameters = Table(
    ("n", "expected"),
    (2,            2),
    (3,            3)
  )

  forAll(parameters) { (n, expected) =>
    new Solution:

      val result = solution.climbStairs(n)
      result shouldBe expected
  }
