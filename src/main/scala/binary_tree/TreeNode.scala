package com.eureka
package binary_tree

sealed trait TreeNode

object TreeNode:

  infix def == (a: TreeNode, b: TreeNode): Boolean =
    (a,b) match
      case (a: Node, b: Node)         if a.root == b.root         => a.left == b.left && a.right == b.right
      case (a: TreeNode, b: TreeNode) if a == Empty && b == Empty => true
      case _                                                      => false


  def serialize(root: TreeNode): Array[Option[Int]] =

    def helper(prev: Vector[List[Option[Int]]], lvl: Int, node: TreeNode): Vector[List[Option[Int]]] =
      val list = if prev.isDefinedAt(lvl) then prev(lvl) else Nil
      val next = if list == Nil then prev :+ list else prev

      node match
        case Empty                                                      => next.updated(lvl, None :: list)
        case Node(root, left, right)                                    => helper(helper(next.updated(lvl, Some(root) :: list), lvl + 1, right), lvl + 1, left)

    helper(Vector.empty, 0, root).reduce((a,b) => a ::: b).toArray


  def deserialize(list: Option[Int]*): TreeNode =

    def helper(lvl: Int, pos: Int): TreeNode =
      if pos >= list.length then
        return Empty

      list(pos) match
        case Some(value) => Node(value, helper(lvl + 1, (lvl * pos) + 1), helper(lvl + 1, (lvl * pos) + 2))
        case None        => Empty

    helper(1, 0)


case class Node(var root: Int, var left: TreeNode = Empty, var right: TreeNode = Empty) extends TreeNode
case object Empty extends TreeNode