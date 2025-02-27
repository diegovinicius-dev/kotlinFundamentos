package Operadores

fun main() {
    println("---------------- CONJUNÇÃO (E/AND) ------------------")

    // Conjunção (E)
    println(true && true)
    println(true && false)
    println(false && true)
    println(false && false)

    println("---------------- DISJUNÇÃO (OU/OR) ------------------")

    // Disjunção (OU)
    println(true || true)
    println(false || true)
    println(true || false)
    println(false || false)

    println("---------------- NEGAÇÃO (NOT) ------------------")

    // Negação (NÃO)
    println(!true)
    println(!false)
}