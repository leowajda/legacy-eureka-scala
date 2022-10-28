package com.eureka
package binary_tree.recursive

import binary_tree.TreeNode.levelOrderDeserialize
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.*
import org.scalatest.Inspectors.forAll

class LC_0297Test extends AnyFunSuite with Matchers:

  trait Codec:
    val codec: LC_0297 = LC_0297()


  private def parameters = levelOrderDeserialize(Some(1), Some(2), Some(3), None, None, Some(4), Some(5)) ::
                           levelOrderDeserialize()                                                        ::
                           Nil

  forAll(parameters) { param =>
    test(s"serialize/deserialize => $param") {
      new Codec:
        val result = codec.deserialize(codec.serialize(param))
        result shouldEqual param
    }
  }

