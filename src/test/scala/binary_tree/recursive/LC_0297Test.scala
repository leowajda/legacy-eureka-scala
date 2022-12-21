package com.eureka
package binary_tree.recursive

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers.shouldEqual
import org.scalatest.prop.TableDrivenPropertyChecks.{Table, forAll}

import binary_tree.TreeNode.levelOrderDeserialize

class LC_0297Test extends AnyFunSuite:

  trait Codec:
    val codec: LC_0297 = LC_0297()

  private def parameters = Table(
    "root",
    levelOrderDeserialize(Some(1), Some(2), Some(3), None, None, Some(4), Some(5)),
    levelOrderDeserialize()
  )

  forAll(parameters) { root =>
      new Codec:
        
        val result = codec.deserialize(codec.serialize(root))
        result shouldEqual root
  }

