package funcoes

fun main() {

    greeting()
    sum(10.5,12.6)

    val a = sum2(12.7, 23.1)
    println(a)

    val b = divide(b = 3.0, a = 10.0)
    println(b)
}

private fun greeting(name: String = "TreinaWeb") {
    println("Olá $name")
}

private fun sum(a: Double, b: Double) {
    println(a + b)
}

private fun sum2(a: Double, b: Double): Double {
    return a + b
}

private fun divide(a: Double, b: Double): Double {
    return a / b
}