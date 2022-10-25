package com.eureka
package binary_tree.recursive

import binary_tree.TreeNode.deserialize
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.*
import org.scalatest.Inspectors.forAll

class LC_0110Test extends AnyFunSuite with Matchers:

  trait Solution:
    val solution: LC_0110 = LC_0110()

  private def parameters = List(

    (deserialize(Some(3), Some(9), Some(20), None, None, Some(15), Some(7)),                 true),
    (deserialize(Some(1), Some(2), Some(2), Some(3), Some(3), None, None, Some(4), Some(4)), false),
    (deserialize(),                                                                          true)

  )

  forAll(parameters) { param =>
    test(s"isBalanced => $param") {
      new Solution:

        val (root, expected) = param
        val result = solution.isBalanced(root)

        result shouldBe expected
    }
  }


