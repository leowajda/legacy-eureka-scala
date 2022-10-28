package com.eureka
package binary_tree.recursive

import binary_tree.TreeNode.levelOrderDeserialize
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.*
import org.scalatest.Inspectors.forAll

class LC_1448Test extends AnyFunSuite with Matchers:

  trait Solution:
    val solution: LC_1448 = LC_1448()

    private def parameters = (levelOrderDeserialize(Some(3), Some(1), Some(4), Some(3), None, Some(1), Some(5)), 4) ::
                             (levelOrderDeserialize(Some(3), Some(3), None, Some(4), Some(2)), 3)                   ::
                             (levelOrderDeserialize(Some(1)), 1)                                                    ::
                              Nil

    forAll(parameters) { param =>
      test(s"goodNodes => $param") {
        new Solution :

          val (root, expected) = param
          val result = solution.goodNodes(root)

          result shouldBe expected
      }

    }
