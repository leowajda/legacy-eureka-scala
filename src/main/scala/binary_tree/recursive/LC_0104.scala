package com.eureka
package binary_tree.recursive

import binary_tree.{Empty, Node, TreeNode}

class LC_0104:
  def maxDepth(root: TreeNode): Int =
    root match
      case node: Node => Math.max(maxDepth(node.left), maxDepth(node.right)) + 1
      case Empty       => 0



