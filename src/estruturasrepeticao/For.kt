package estruturasrepeticao

fun main() {
    for (x in 10 downTo 1) {
        print(x)
    }
    print(" ")

    for (x in 1..10) {
        print(x)
    }
    print(" ")

    for (x in 10 downTo 1 step 2) {
        print(x)
    }
    print(" ")

    for (i in 0 until 3) {
        print(i)
    }
    println(" ")

    val cakes = listOf("cenoura", "queijo", "chocolate")
    for (cake in cakes) {
        println("Yummi, isto é um bolo de $cake!")
    }
}