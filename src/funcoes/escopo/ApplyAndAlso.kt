package funcoes.escopo

data class Person(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

fun writeCreationLog(p: Person) {
    println("Uma nova pessoa ${p.name} foi criada.")
}

fun main() {

    val jake = Person()
    val stringDescription = jake.apply {
        name = "Jake"
        age = 30
        about = "Android developer"
    }.toString()
    println(stringDescription)

    // Função Also
    val mike = Person("Mike", 25, "Android developer")
        .also {
            writeCreationLog(it)
        }

}
