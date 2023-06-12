enum class MESSAGES {
    CRACK,
    PRO
}

fun main() {

    val name = "Carolina"

    // If
    if (name.isNotEmpty()) {
        println("El largo de la variable nombre es ${name.length}")
    }
    else println("Error, name está vacío")

    val message: String = if(name.length > 4) "Tu nombre es largo"
    else "Tienes un nombre corto"
    println(message)

    // When
    when (name) {
        "Alberto" -> println("Wow, tú eres muy bueno programando, un ${MESSAGES.PRO}")
        "Carolina" -> println("Wow, tu novio es muy buen programador. Un ${MESSAGES.CRACK}")
        "Wilmer", "Magnolia", "Ciro" -> {
            println("Wow, Brayan es muy buen programador. Un ${MESSAGES.CRACK}")
        }
        else -> println("Funcionalidad no implementada")
    }
    var code = 200
    when (code) {
        in 200..299 -> println("Todo bien, todo bonito")
        in 400..500 -> println("Algo ha fallado en el servidor o en el cliente")
        else -> println("Código desconocido")
    }
    when {
        code > 0 -> println("Positivo")
    }

    // While y Do While
    while (code > 0) {
        println("El valor del code es $code")
        code-=50
    }
    do {
        val randomNum = (0..100).random()
        println("El número aleatorio es $randomNum")
    } while (randomNum > 25)

}