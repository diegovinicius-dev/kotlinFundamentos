package oop

open class Dog { // Open class chave para herança
    open fun sayHello() {
        println("wow wow")
    }
}

class Yorkshire : Dog() {
    override fun sayHello() {
        println("wif wif")
    }
}

fun main() {
    val dog: Dog = Yorkshire()
    dog.sayHello()
}