package com.eureka
package string.iterative

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers.shouldBe
import org.scalatest.prop.TableDrivenPropertyChecks.{Table, forAll}

class LC_1143Test extends AnyFunSuite:

  trait Solution:
    val solution: LC_1143 = LC_1143()

  private def parameters = Table(
    ("a",      "b",   "expected"),
    ("abcde", "ace",           3),
    ("abc",   "abc",           3),
    ("abc",   "def",           0)
  )

  forAll(parameters) { (a, b, expected) =>
    new Solution:

      val result = solution.longestCommonSubsequence(a, b)
      result shouldBe expected
  }



