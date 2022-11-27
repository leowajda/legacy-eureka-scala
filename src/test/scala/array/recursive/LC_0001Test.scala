package com.eureka
package array.recursive

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers.{should, contain}
import org.scalatest.prop.TableDrivenPropertyChecks.{Table, forAll}

class LC_0001Test extends AnyFunSuite:

  trait Solution:
    val solution: LC_0001 = LC_0001()
  
  private def parameters = Table(
    ("nums",           "target",  "expected"),
    (Array(2,7,11,15),  9,        Array(0,1)),
    (Array(3,2,4),      6,        Array(1,2)),
    (Array(3,3),        6,        Array(0,1))
  )

  forAll(parameters) { (nums, target, expected) =>
      new Solution:
        
        val result = solution.twoSum(nums, target)
        result should contain theSameElementsAs expected
  }

