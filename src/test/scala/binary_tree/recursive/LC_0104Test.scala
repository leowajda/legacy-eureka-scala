package com.eureka
package binary_tree.recursive

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.*
import org.scalatest.Inspectors.forAll

import binary_tree.TreeNode.deserialize

class LC_0104Test extends AnyFunSuite with Matchers:

  trait Solution:
    val solution: LC_0104 = LC_0104()
  
  private def parameters = List(

    (deserialize(Some(3), Some(9), None, None, Some(15), Some(7)), 3),
    (deserialize(Some(1), None, Some(2)), 2)

  )

  forAll(parameters) { param =>
    test(s"maxDepth => $param") {
      new Solution:

        val (root, expected) = param
        val result = solution.maxDepth(root)

        result shouldBe expected
    }

  }