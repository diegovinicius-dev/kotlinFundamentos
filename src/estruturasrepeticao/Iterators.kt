package estruturasrepeticao

class Animal(val name: String)

class Zoo(val animals: List<Animal>) {

    operator fun iterator(): Iterator<Animal> {
        return animals.iterator()
    }
}

fun main() {

    val animals = listOf(Animal("Zebra"), Animal("Leão"))
    val zoo = Zoo(animals)

    for (animal in zoo) {
        println("Olha, isto é um(a) ${animal.name}")
    }
}