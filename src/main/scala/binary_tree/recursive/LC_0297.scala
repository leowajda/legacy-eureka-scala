package com.eureka
package binary_tree.recursive

import binary_tree.{Empty, Node, TreeNode}

class LC_0297:

  def serialize(root: TreeNode): String =
    def helper(node: TreeNode, list: List[Option[Int]]): List[Option[Int]] = node match
      case Node(root, left, right) => Some(root) :: helper(left, helper(right, list))
      case Empty                   => None :: list

    helper(root, Nil).map{case Some(value) => value.toString case None => "#" }.mkString(" ")

  def deserialize(data: String): TreeNode =
    def helper(iterator: Iterator[String]): TreeNode = iterator.next match
      case "#"   => Empty
      case value => Node(value.toInt, helper(iterator), helper(iterator))

    helper(data.split(" ").iterator)


