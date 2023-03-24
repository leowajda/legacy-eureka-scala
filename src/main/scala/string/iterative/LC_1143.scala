package com.eureka
package string.iterative

class LC_1143:

  private class Lazy[A](expr: => A):
    private lazy val value = expr
    def apply(): A = value

  private object Lazy { def apply[A](expr: => A) = new Lazy(expr) }

  def longestCommonSubsequence(a: String, b: String): Int =
    val (m, n) = (a.length + 1, b.length + 1)
    lazy val memo: Array[Array[Lazy[Int]]] = Array.tabulate(m, n) {
        case (0, _) | (_, 0)                => Lazy(0)
        case (i, j) if a(i - 1) == b(j - 1) => Lazy(memo(i - 1)(j - 1)() + 1)
        case (i, j)                         => Lazy(memo(i - 1)(j)() max memo(i)(j - 1)())
    }

    memo.last.last()