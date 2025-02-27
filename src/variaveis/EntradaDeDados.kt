package variaveis

fun main() {

    print("Escreva seu nome: ")
    val name = readln()

    println("Olá, $name")

    print("Digite um número: ")
    val a = readln().toInt()
    print("Digite um número: ")
    val b = readln().toInt()

    val result = a + b
    println("A soma dos números é: $result")

}