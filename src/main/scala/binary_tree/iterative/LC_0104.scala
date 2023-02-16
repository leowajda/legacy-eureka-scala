package com.eureka
package binary_tree.iterative

import binary_tree.{Empty, Node, TreeNode}

import scala.annotation.tailrec
import scala.math.max

class LC_0104:
  def maxDepth(root: TreeNode): Int =

    @tailrec
    def helper(level: List[Node], counter: Int = 0): Int = level match
      case list if list.nonEmpty  => helper(level.flatMap {
        case Node(_, left @ Node(_, _, _), right @ Node(_, _, _)) => left :: right :: Nil
        case Node(_, left @ Node(_, _, _), Empty)                 => left :: Nil
        case Node(_, Empty, right @ Node(_, _, _))                => right :: Nil
        case _                                                    => Nil
      }, counter + 1)
      case _                      => counter

    helper(root match { case node @ Node(_, _, _) => node :: Nil case Empty => Nil })
