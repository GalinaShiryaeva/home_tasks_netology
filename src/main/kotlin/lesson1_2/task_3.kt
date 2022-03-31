package lesson1_2

import kotlin.random.Random

fun main() {
    print("Предыдущая сумма покупок: ")
    val purchaseAmount = readln().toUInt()

    val currentPurchase = 1_350u
    println("Текущая покупка на сумму: $currentPurchase.0 руб.")

    var finalAmount = 0.0

    if (Random.nextBoolean()) {
        if (purchaseAmount <= 1_000u) {
            finalAmount = currentPurchase.toDouble() * 0.99
            print("Скидка \'Меломана\' 1 %. ")
        } else if (purchaseAmount <= 10_000u) {
            finalAmount = (currentPurchase - 100u).toDouble() * 0.99
            print("Скидка 100 руб., Скидка 'Меломана' 1 %. ")
        } else {
            finalAmount = currentPurchase.toDouble() * 0.95 * 0.99
            print("Скидка 5 %., Скидка 'Меломана' 1 %. ")
        }
    } else {
        if (purchaseAmount <= 1_000u) {
            finalAmount = currentPurchase.toDouble()
            print("Скидки не применены. ")
        } else if (purchaseAmount <= 10_000u) {
            finalAmount = (currentPurchase - 100u).toDouble()
            print("Скидка 100 руб. ")
        } else {
            finalAmount = currentPurchase.toDouble() * 0.95
            print("Скидка 5 %. ")
        }
    }

    println("Итоговая сумма покупки: " + "%.2f".format(finalAmount) + " руб.")
}