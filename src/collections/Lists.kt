package collections

val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)
val sudoers: List<Int> = systemUsers

fun addSystemUser(newUser: Int) {
    systemUsers.add(newUser)
}

fun getSysSudoers(): List<Int> {
    return sudoers
}

fun main() {
    addSystemUser(4)
    println("Tot sudoers: ${getSysSudoers().size}")
    getSysSudoers().forEach {
        i -> println("Some useful info on user $i")
    }
    // getSysSudoers().add(5) <- Erro!


    val l1 = listOf("A", "B", "C")

    println(l1)

    for (i in l1) {
        println(i)
    }

    val ml1 = mutableListOf("A", "B", "C")
    println(ml1)

    for (i in ml1) {
        println(i)
    }

    ml1.add("D")
    println(ml1)
    ml1.add(1, "E")
    println(ml1)
    ml1.removeAt(1)
    println(ml1)

}