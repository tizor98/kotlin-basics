package project

import kotlin.system.exitProcess

fun main() {

    println("-------------------------------------------")
    println("Hola, soy tu bola mágica creada en Kotlin")
    playGame()

}

fun playGame() {
    println("-------------------------------------------")
    println("¿Cuál de estas opciones desear realizar?")
    println("1. Realizar pregunta")
    println("2. Revisar todas las respuestas")
    println("0. Salir")
    println("-------------------------------------------")

    val userOption = readlnOrNull() ?: ""
    when (userOption) {
        "1" -> askAQuestion()
        "2" -> showAnswers()
        "0" -> exitProgram()
        else -> playGame()
    }

    println("-------------------------------------------")
    println("Para continuar presiona cualquier tecla ...")
    readlnOrNull()

    playGame()
}

fun askAQuestion() {
    println("¿Qué pregunta quieres realizar?")
    val question = readlnOrNull()?.trim() ?: ""
    if(question.isEmpty()) {
        println("No preguntaste nada, vuelve a intentarlo")
        return
    }

    if (responseMemory.containsKey(question)) {
        println("Ya lo preguntaste, tu respuesta fue")
        println(responseMemory[question])
        return
    }
    println("Interesante pregunta ... la respuesta es")
    val randomResponse = responseMap.keys.random()
    responseMemory[question] = randomResponse
    println(randomResponse)
}

fun showAnswers() {
    if(responseMemory.isEmpty()) {
        println("No has realizado preguntas hasta el momento")
        return
    }

    println("Las preguntas junto con sus respectivas respuestas han sido:")
    for (question in responseMemory.keys) {
        println("- - - - - - - - - - - - - - - - - - - - - - - - - -")
        println("Tu pregunta  : $question")
        println("Tu respuesta : ${responseMemory[question]}")
    }

    println("- - - - - - - - - - - - - - - - - - - - - - - - - -")
    println("En total has tenido")
    println("Respuestas positivas :  ${responseMemory.values.count { responseMap[it]?.equals(RESPONSE.AFFIRMATIVE) ?: false }}")
    println("Respuestas difusas   :  ${responseMemory.values.count { responseMap[it]?.equals(RESPONSE.UNCLEAR) ?: false }}")
    println("Respuestas negativas :  ${responseMemory.values.count { responseMap[it]?.equals(RESPONSE.NEGATIVE) ?: false }}")
}

fun exitProgram() {
    println("-------------------------------------------")
    println("¡Fue un buen tiempo juntos!")
    println("-------------------------------------------")
    exitProcess(0)
}

val responseMemory = mutableMapOf<String,String>()

enum class RESPONSE {
    AFFIRMATIVE,
    NEGATIVE,
    UNCLEAR
}

val responseMap = mapOf(
    "Sí" to RESPONSE.AFFIRMATIVE,
    "Es cierto" to RESPONSE.AFFIRMATIVE,
    "Totalmente" to RESPONSE.AFFIRMATIVE,
    "Sin duda" to RESPONSE.AFFIRMATIVE,
    "Pregunta en otro momento" to RESPONSE.UNCLEAR,
    "No puedo decirte en este momento" to RESPONSE.UNCLEAR,
    "Puede que sí o puede que no" to RESPONSE.UNCLEAR,
    "No va a suceder" to RESPONSE.NEGATIVE,
    "No cuentes con ellos" to RESPONSE.NEGATIVE,
    "Definitivamente no" to RESPONSE.NEGATIVE,
    "No" to RESPONSE.NEGATIVE
)
