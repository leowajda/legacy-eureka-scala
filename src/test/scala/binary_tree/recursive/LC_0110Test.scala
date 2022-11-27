package com.eureka
package binary_tree.recursive

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers.shouldBe
import org.scalatest.prop.TableDrivenPropertyChecks.{Table, forAll}

import binary_tree.TreeNode.levelOrderDeserialize

class LC_0110Test extends AnyFunSuite:

  trait Solution:
    val solution: LC_0110 = LC_0110()

  private def parameters = Table(
    ("root",                                                                                        "expected"),
    (levelOrderDeserialize(Some(3), Some(9), Some(20), None, None, Some(15), Some(7)),                   true),
    (levelOrderDeserialize(Some(1), Some(2), Some(2), Some(3), Some(3), None, None, Some(4), Some(4)),  false),
    (levelOrderDeserialize(),                                                                            true)
  )

  forAll(parameters) { (root, expected) =>
      new Solution:
        
        val result = solution.isBalanced(root)
        result shouldBe expected
  }


