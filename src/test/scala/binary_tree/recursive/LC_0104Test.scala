package com.eureka
package binary_tree.recursive

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers.shouldBe
import org.scalatest.prop.TableDrivenPropertyChecks.{Table, forAll}

import binary_tree.TreeNode.levelOrderDeserialize

class LC_0104Test extends AnyFunSuite:

  trait Solution:
    val solution: LC_0104 = LC_0104()
  
  private def parameters = Table(
    ("root",                                                                "expected"),
    (levelOrderDeserialize(Some(3), Some(9), None, None, Some(15), Some(7)),        3),
    (levelOrderDeserialize(Some(1), None, Some(2)),                                 2)
  )

  forAll(parameters) { (root, expected) =>
      new Solution:
        
        val result = solution.maxDepth(root)
        result shouldBe expected
  }