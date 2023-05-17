package com.luowensheng.mathix


class Interval(private val start: Int, private val end: Int, private val step: Int) {
    fun toList(): List<Int> {
        val n = kotlin.math.abs((end - start) / step)
        return List(n) { start + step * it }
    }
}