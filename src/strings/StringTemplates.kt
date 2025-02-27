package strings

fun main() {
    val firstName = "Diego"
    val lastName = "Cavalcante"
    val fullname = "$firstName $lastName"

    println(fullname)

    val num1 = readln().toDouble()
    val num2 = readln().toDouble()

    println("A soma de $num1 e $num2 é: ${num1 + num2}")
}