package com.eureka
package array.recursive

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.*

import array.recursive.LC_0001.twoSum

class LC_0001Test extends AnyFunSuite with Matchers:

  private def parameters = List(

    (Array(2,7,11,15), 9, Array(0,1)),
    (Array(3,2,4),     6, Array(1,2)),
    (Array(3,3),       6, Array(0,1))

  )

  test("twoSum") {

    for param <- parameters do
      val result   = twoSum(param._1, param._2)
      val expected = param._3

      result should contain theSameElementsAs expected

  }