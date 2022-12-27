package com.eureka
package binary_tree.recursive

import binary_tree.{Empty, Node, TreeNode}

import scala.math.max

class LC_0104:
  def maxDepth(root: TreeNode): Int = root match
      case node: Node => 1 + max(maxDepth(node.left), maxDepth(node.right))
      case Empty      => 0



