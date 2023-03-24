package com.eureka
package string.recursive

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers._
import org.scalatest.prop.TableDrivenPropertyChecks.{forAll, Table}

class LC_0022Test extends AnyFunSuite:

  trait Solution:
    val solution: LC_0022 = LC_0022()

  private def parameters = Table(
    ("n",                                                        "expected"),
    (1,                                                         "()" :: Nil),
    (3,     "((()))" :: "(()())" :: "(())()" :: "()(())" :: "()()()" :: Nil)
  )

  forAll(parameters) { (n, expected) =>
    new Solution:

      val result = solution.generateParenthesis(n)
      result should contain theSameElementsAs expected
  }

