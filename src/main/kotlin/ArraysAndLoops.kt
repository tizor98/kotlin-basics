import java.util.AbstractList

fun main() {

    val fruitsList = listOf("Manzana", "Pera", "Frambuesa", "Fresa")
    // For
    for (fruit in fruitsList) println("Hoy voy a comer una ${fruit.lowercase()}")

    fruitsList.forEach{fruit -> println("¿Te gusta la ${fruit.lowercase()}?")}

    // Map
    val fruitLength: List<Int> = fruitsList.map{ fruit -> fruit.length}
    println(fruitLength)

    // Filter
    val filterList = fruitsList.filter { fruit -> fruit.length <= 5 }
    println(filterList)

}