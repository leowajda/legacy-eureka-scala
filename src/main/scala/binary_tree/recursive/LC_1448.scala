package com.eureka
package binary_tree.recursive

import binary_tree.{Empty, Node, TreeNode}

import Math.max

class LC_1448:
  def goodNodes(root: TreeNode): Int =
    def helper(root: TreeNode, prev: Int): Int = root match
      case Node(value, left, right) => (if value >= prev then 1 else 0) + helper(left, prev max value) + helper(right, prev max value)
      case Empty                   => 0

    helper(root, Int.MinValue)