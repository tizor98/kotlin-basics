fun main() {

    // Un boolean nullable puede tener false, true, y null

    var signature : String? = null

    // Solo ejecuta si no es nulo, en este caso devuelve nulo
    println(signature?.length)

    // Le decimos al compilador que debe ejecutar esto sí o sí
    // println(signature!!.length)

    try {
        signature!!.length
    }
    catch (e: NullPointerException)
    {
        println(e.javaClass)
    }
    finally {
        println("Hi visitor :)")
    }

    // Usar un try catch para asignar un valor
    val num1 = 22
    val num2 = 0
    val result: Int = try { num1 / num2 } catch (e: Exception) { 0 }
    println(result)

    // Elvis operator
    val charSignature: Int = signature?.length ?: 0
    println(charSignature)

}