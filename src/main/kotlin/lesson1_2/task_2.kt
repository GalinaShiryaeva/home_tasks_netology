package lesson1_2

fun main() {
    print("Введите количество лайков: ")
    val likes: Int = readln().toInt()

    val result: String = if (likes % 10 == 1)  "Понравилось $likes человеку" else "Понравилось $likes людям"

    println(result)
}