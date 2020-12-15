package ru.netology

fun main() {
    val amount = 1000000
    val commission = if (0.0075 * amount < 3500.0) 3500.0 else 0.0075 * amount
    val minAmount = 35

    val totalPrice = amount * commission
    val result = amount + totalPrice
    println("Minimum pay: $minAmount")
    println("You paid: $amount")
    println("To pay: $result")
}
