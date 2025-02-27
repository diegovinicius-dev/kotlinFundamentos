package nullsafety

fun main() {
    val name: String? = "Diego"
    // val length = if (name != null) name.length else 0
    val length = name?.length ?: 0
    println(length)


    val nomeContato: String? = null
    val nomeContatoObrigatorio: String = nomeContato ?: "Valor Padrão"
    println(nomeContatoObrigatorio)

}