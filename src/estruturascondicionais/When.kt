package estruturascondicionais

fun main() {
    val month = 1

    val name = when (month) {
        1 -> println("Janeiro")
        2 -> println("Fevereiro")
        3 -> println("Março")
        4 -> println("Abril")
        5 -> println("Maio")
        else -> println("Junho")
    }

    println(name)

}