package collections

fun main() {

    val m1 = mapOf("nome" to "Diego", "endereço" to "PB")
    println(m1)

    println(m1["nome"])
    println(m1["endereço"])

    val mm1 = mutableMapOf("nome" to "Diego", "endereço" to "PB")
    println(mm1)

    println(mm1["nome"])
    println(mm1["endereço"])

    mm1["nome"] = "Diego Cavalcante"
    println(mm1)

    mm1["telefone"] = "(83) 99999-1234"
    println(mm1)

    for (i in mm1) {
        println("chave=${i.key} e valor=${i.value}")
    }

}