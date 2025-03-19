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

/*
fun cases(obj: Any) {
    when (obj) {
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a String")
        else -> println("Unkown")
    }

    cases("Hello")
    cases("hello")
    cases(1)
    cases(0L)
}*/
