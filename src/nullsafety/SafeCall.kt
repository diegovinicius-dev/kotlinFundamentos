package nullsafety

fun main() {
    var name: String? = "Diego"
    println(name?.length)

    name = null
    println(name?.length)

}