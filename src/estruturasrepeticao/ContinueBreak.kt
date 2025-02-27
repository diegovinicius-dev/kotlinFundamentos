package estruturasrepeticao

fun main() {
    for (x in 1..50) {
        if (x % 7 == 0) {
            continue
        }

        if (x == 30) {
            break
        }

        println(x)
    }

    for (i in 1..5) {
        if (i % 2 == 0) {
            continue
            println(i)
        }
        println(i)
    }
}