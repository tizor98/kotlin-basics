fun main() {

    printPhrase("Alberto Ortiz".convertCase())
    printFullName(surname = "Rodriguez", name = "Carolina")

    val myLambda: (String) -> Int = {
            str -> str.length
    }
    val myLambda2: (String) -> Int = { it.length }
    println(myLambda("Hola, yo soy un desarrollador de software"))
    println(myLambda2("Hola, yo soy un desarrollador de software"))
    println(listOf("Hello", "Hola", "Ciao").map(myLambda))

    val lengthInitialVal = superFunction("Hola, este es un ejemplo", myLambda2)
    println(lengthInitialVal)

    val siHiFunction: () -> String = functionInception("Alberto")
    println(siHiFunction())

    var value: String? = null
    value?.let(myLambda)
    value = "Ana"
    value?.let(myLambda)

    val colors = listOf("Azul", "Naranja", "Morado")
    with (colors) {
        println("Tus colores son $this")
        println("El tamaño de la lista es $size")
    }
    // También existe run, apply, y also

}

fun String.convertCase(): String {
    val printUpperCase = 0..1
    return if (printUpperCase.random() == 1) this.uppercase() else this.lowercase()
}

fun printPhrase(phrase: String): Unit {
    println("Tu frase es: $phrase")
}

fun printFullName(name: String, secondName: String = "", surname: String) {
    println("Mi nombre completo es $name $secondName $surname")
}

fun superFunction(initialVal: String, block: (String) -> Int): Int {
    return block(initialVal)
}

fun functionInception(name: String): () -> String {
    return {
        "Hola $name desde la lambda"
    }
}
