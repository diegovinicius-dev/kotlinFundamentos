package funcoes.escopo

import kotlin.concurrent.fixedRateTimer

// Functions como parametros
fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

fun sum(x: Int, y: Int) = x + y

//Como criar uma funcao de alta ordem
fun operation(): (Int) -> Int {
    return ::square
}

fun square(x: Int) = x * x

//Como funciona
fun main() {
    val sumResult = calculate(4, 5, ::sum)
    val mulResult = calculate(4, 5) { a, b -> a * b }
    println("sumResult $sumResult, multResult $mulResult")

    val func = operation()
    println(func(2))
}