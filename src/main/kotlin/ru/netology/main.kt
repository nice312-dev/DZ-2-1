package ru.netology

fun main() {
    val amount = 1000000
    val commission = if (0.0075 * amount < 3500.0) 3500.0 else 0.0075 * amount

    println("You commission: $commission")
}
