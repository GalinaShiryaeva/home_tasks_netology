package lesson1_2

const val MIN_AMOUNT = 3_600u
const val MIN_TAX = 3_500u
const val KOPECKS_IN_RUBLES = 100u
const val TAX = 0.0075

fun main() {
    print("Введите сумму перевода в рублях: ")
    val amount: UInt = readln().toUInt() * KOPECKS_IN_RUBLES

    if (amount < MIN_AMOUNT) {
        println("Минимальная сумма перевода 35 руб.")
    } else {
        val amountForTaxEquals35 = MIN_TAX.toDouble() / TAX // 466 666.6666666667 копеек

        val taxAmount: Double = if (amount.toDouble() > amountForTaxEquals35)
            amount.toDouble() * TAX / KOPECKS_IN_RUBLES.toDouble()
        else (MIN_TAX / KOPECKS_IN_RUBLES).toDouble()
        println("Комиссия составила: " + "%.2f".format(taxAmount) + " руб.")
    }
}