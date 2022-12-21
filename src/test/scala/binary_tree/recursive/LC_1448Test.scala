package com.eureka
package binary_tree.recursive

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers.shouldBe
import org.scalatest.prop.TableDrivenPropertyChecks.{Table, forAll}

import binary_tree.TreeNode.levelOrderDeserialize

class LC_1448Test extends AnyFunSuite:

  trait Solution:
    val solution: LC_1448 = LC_1448()

  private def parameters = Table(
    ("root",                                                                    "expected"),
    (levelOrderDeserialize(Some(3), Some(1), Some(4), Some(3), None, Some(1), Some(5)),  4),
    (levelOrderDeserialize(Some(3), Some(3), None, Some(4), Some(2)),                    3),
    (levelOrderDeserialize(Some(1)),                                                     1)
  )

  forAll(parameters) { (root, expected) =>
    new Solution :

      val result = solution.goodNodes(root)
      result shouldBe expected
  }
