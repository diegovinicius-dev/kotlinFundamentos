package nullsafety

fun main() {
    val name: String? = "Diego"
    val reversed = name!!.reversed() // não recomendado

    println(reversed)

}