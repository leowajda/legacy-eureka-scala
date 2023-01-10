package com.eureka
package binary_tree.recursive

import binary_tree.{Empty, Node, TreeNode}

class LC_0100:
  def isSameTree(p: TreeNode, q: TreeNode): Boolean =

    def helper(a: TreeNode, b: TreeNode): Boolean = (a, b) match
      case (Node(aVal, aLeft, aRight), Node(bVal, bLeft, bRight)) if aVal == bVal => helper(aLeft, bLeft) && helper(aRight, bRight)
      case (Empty, Empty)                                                         => true
      case _                                                                      => false

    helper(p, q)