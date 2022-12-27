package com.eureka
package math.recursive

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers.shouldBe
import org.scalatest.prop.TableDrivenPropertyChecks.{Table, forAll}

class LC_0150Test extends AnyFunSuite:

  trait Solution:
    val solution: LC_0150 = LC_0150()

  private def parameters = Table(
    ("tokens",                                                           "expected"),
    (Array("2", "1", "+", "3", "*"),                                              9),
    (Array("4",  "13", "5", "/", "+"),                                            6),
    (Array("10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"), 22)
  )

  forAll(parameters) { (tokens, expected) =>
    new Solution:

      val result = solution.evalRPN(tokens)
      result shouldBe expected
  }
