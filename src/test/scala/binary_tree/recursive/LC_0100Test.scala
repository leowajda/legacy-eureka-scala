package com.eureka
package binary_tree.recursive

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers.shouldBe
import org.scalatest.prop.TableDrivenPropertyChecks.{Table, forAll}

import binary_tree.TreeNode.levelOrderDeserialize

class LC_0100Test extends AnyFunSuite:

  trait Solution:
    val solution: LC_0100 = LC_0100()

  private def parameters = Table(
    ("p",                                              "q",                                             "expected"),
    (levelOrderDeserialize(Some(1), Some(2), Some(3)), levelOrderDeserialize(Some(1), Some(2), Some(3)),      true),
    (levelOrderDeserialize(Some(1), Some(2)),          levelOrderDeserialize(Some(1), None, Some(2)),        false),
    (levelOrderDeserialize(Some(1), Some(2), Some(1)), levelOrderDeserialize(Some(1), Some(1), Some(2)),     false)
  )

  forAll(parameters) { (p, q, expected) =>
    new Solution:

      val result = solution.isSameTree(p, q)
      result shouldBe expected
  }