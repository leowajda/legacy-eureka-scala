package com.eureka
package array.recursive

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers.*
import org.scalatest.prop.TableDrivenPropertyChecks.{Table, forAll}

class LC_0739Test extends AnyFunSuite:

  trait Solution:
    val solution: LC_0739 = LC_0739()

  private def parameters = Table(
    ("x",                                                      "expected"),
    (Array(73, 74, 75, 71, 69, 72, 76, 73), Array(1, 1, 4, 2, 1, 1, 0, 0)),
    (Array(30, 40, 50, 60),                             Array(1, 1, 1, 0)),
    (Array(30, 60, 90),                                    Array(1, 1, 0))
  )

  forAll(parameters) { (temperatures, expected) =>
    new Solution:

      val result = solution.dailyTemperatures(temperatures)
      result should equal (expected)
  }

