package oop

open class Tiger(val origin: String) {
    fun sayHello() {
        println("Um tigre de $origin diz: grrhhh!")
    }
}

class SiberianTiger : Tiger("Siberia")

open class Lion(val name: String, val origin: String) {
    fun rugido() {
        println("$name, o leão de $origin diz: graoh!")
    }
}

class Asiatic(name: String) : Lion(name = name, origin = "India")

fun main() {
    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()

    val lion: Lion = Asiatic("Rufo")
    lion.rugido()
}