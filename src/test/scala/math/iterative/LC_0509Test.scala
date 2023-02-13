package com.eureka
package math.iterative

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers.shouldBe
import org.scalatest.prop.TableDrivenPropertyChecks.{Table, forAll}

class LC_0509Test extends AnyFunSuite:

  trait Solution:
    val solution: LC_0509 = LC_0509()

  private def parameters = Table(
    ("n", "expected"),
    (2,            1),
    (3,            2),
    (4,            3),
    (5,            5)
  )

  forAll(parameters) { (n, expected) =>
    new Solution:

      val result = solution.fib(n)
      result shouldBe expected
  }
