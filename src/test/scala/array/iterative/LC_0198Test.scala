package com.eureka
package array.iterative

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers.shouldBe
import org.scalatest.prop.TableDrivenPropertyChecks.{Table, forAll}

class LC_0198Test extends AnyFunSuite:

  trait Solution:
    val solution: LC_0198 = LC_0198()

  private def parameters = Table(
    ("nums",               "expected"),
    (Array(1, 2, 3, 1),             4),
    (Array(2, 7, 9, 3, 1),         12),
    (Array(2, 1, 1, 2),             4)
  )
  
  forAll(parameters) { (nums, expected) =>
      new Solution:
        
        val result = solution.rob(nums)
        result shouldBe expected
  }

