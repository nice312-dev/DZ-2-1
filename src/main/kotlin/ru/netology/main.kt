package ru.netology

fun main() {
    val amount = 100
    val commission = 0.0075
    val minAmount = 35

    val totalPrice = amount * commission
    val result = amount + totalPrice
    println("Minimum pay: $minAmount")
    println("You paid: $amount")
    println("To pay: $result")
}