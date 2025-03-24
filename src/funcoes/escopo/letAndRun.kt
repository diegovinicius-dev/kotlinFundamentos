package funcoes.escopo

fun customPrint(s: String) {
    print(s.uppercase())
}

// Função de Escopo -> Let
fun main() {

    val empty = "test".let {
        customPrint(it)
        it.isEmpty()
    }
    println(" is empty: $empty")

    fun printNonNull(str: String?) {
        println("Printing \"$str\":")

        str?.let {
            print("\t")
            customPrint(it)
            println()
        }
    }

    fun printIfBothNonNull(strOne: String?, strTwo: String?) {
        strOne?.let { firstString ->
            strTwo?.let { secondString ->
                customPrint("$firstString : $secondString")
                println()
            }
        }
    }

    printNonNull(null)
    printNonNull("my string")
    printIfBothNonNull("First", "Second")

    // Função de Escopo -> Run
    fun getNullableLength(ns: String?) {
        println("for \"$ns\":")
        ns?.run {
            println("\tis empty? " + isEmpty())
            println("\tlength = $length")
            length
        }
    }
    getNullableLength(null)
    getNullableLength("")
    getNullableLength("some string with Kotlin")

}