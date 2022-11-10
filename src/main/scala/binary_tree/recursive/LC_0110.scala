package com.eureka
package binary_tree.recursive

import binary_tree.{Empty, Node, TreeNode}
import scala.math.{abs, max}

class LC_0110:
  def isBalanced(root: TreeNode): Boolean =
    def helper(root: TreeNode): Int = root match
      case Node(_, left, right) => (helper(left), helper(right)) match
        case (-1, _) | (_, -1)        => -1
        case (a, b) if abs(a - b) > 1 => -1
        case (a, b)                   => max(a, b) + 1
      case Empty                => 0

    helper(root) != -1