package com.eureka
package binary_tree.recursive

import binary_tree.{Empty, Node, TreeNode}

import math.max

class LC_0104:
  def maxDepth(root: TreeNode): Int = root match
      case node: Node => max(maxDepth(node.left), maxDepth(node.right)) + 1
      case Empty      => 0



