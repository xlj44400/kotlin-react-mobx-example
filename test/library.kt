package org.sample

fun factorial(n: Int): Long = if (n == 0) 1 else n * factorial(n - 1)

inline fun IntRange.forOdd(f: (Int) -> Unit) {
    this.forEach { if (it % 2 == 1) f(it) }
}