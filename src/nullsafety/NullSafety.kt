package nullsafety

fun main() {

    var neverNull: String = "Isto não pode ser null"
//    neverNull = null -> Aqui dá erro!

    var nullable: String? = "Você pode atribuir null aqui"
    nullable = null

    var inferredNonNull = "O compilador assume non-null"
//    inferredNonNull = null -> dá erro também

    fun strLength(str: String?): Int {
        return str?.length ?: 0
    }

    strLength(neverNull)
    strLength(nullable) // -> Dá erro, pois ele assume que a variável pode ser nula, só não dá erro com elvesOperator

}