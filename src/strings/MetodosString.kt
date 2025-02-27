package strings

fun main() {
    val name = "Diego Cavalcante"

    println(name.reversed())
    println(name.uppercase())
    println(name.lowercase())
    println(name.equals("Diego")) // prefira name == "Diego"
    println(name.slice(0..2))
    println(name.length) // tamanho da string
    println(name.get(10)) // prefira name[10]
    println(name.startsWith("Die"))
    println(name.endsWith("nte"))

}