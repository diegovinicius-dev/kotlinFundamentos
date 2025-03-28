package funcoes.escopo

data class ApplyAndAlso(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

fun writeCreationLog(p: ApplyAndAlso) {
    println("Uma nova pessoa ${p.name} foi criada.")
}

fun main() {

    val jake = ApplyAndAlso()
    val stringDescription = jake.apply {
        name = "Jake"
        age = 30
        about = "Android developer"
    }.toString()
    println(stringDescription)

    // Função Also
    val mike = ApplyAndAlso("Mike", 25, "Android developer")
        .also {
            writeCreationLog(it)
        }

}
