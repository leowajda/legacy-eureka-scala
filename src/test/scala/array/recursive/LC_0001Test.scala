package com.eureka
package array.recursive

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.*
import array.recursive.LC_0001

import org.scalatest.Inspectors.forAll
import org.scalatest.Outcome

class LC_0001Test extends AnyFunSuite with Matchers:

  trait Solution:
    val solution: LC_0001 = LC_0001()

  private def parameters = List(

    (Array(2,7,11,15), 9, Array(0,1)),
    (Array(3,2,4),     6, Array(1,2)),
    (Array(3,3),       6, Array(0,1))

  )

  forAll(parameters) { param =>
    test(s"twoSum => $param") {
      new Solution:

        val result = solution.twoSum(param._1, param._2)
        val expected = param._3

        result should contain theSameElementsAs expected

    }
  }

