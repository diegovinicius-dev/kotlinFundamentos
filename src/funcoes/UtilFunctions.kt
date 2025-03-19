package funcoes

fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val positives = numbers.filter { x -> x > 0 }
    val negatives = numbers.filter { it < 0 } // Usar notação 'it' para numeros negativos

    println("Numbers: $numbers")
    println("Positive Numbers: $positives")
    println("Negative Numbers: $negatives")

    // Transformação dos elementos da lista -> map
    val doubled = numbers.map { x -> x * 2 }
    val tripled = numbers.map { it * 3 }

    // Pegar qualquer elemento -> any (Boolean)
    val anyNegative = numbers.any { it < 0 }
    val anyGT6 = numbers.any { it > 6 }

    // flatMap -> vai juntar tudo como se fossa uma estrutura de dados só
    val fruitsBag = listOf("maçã", "laranja", "banana", "uvas")
    val clothesBag = listOf("camisetas", "calças", "jeans")
    val cart = listOf(fruitsBag, clothesBag)
    val mapBag = cart.map { it }
    val flatMapBag = cart.flatMap { it }

    println("Sua bolsa: $mapBag")
    println("Suas coisas compradas são: $flatMapBag")
}

