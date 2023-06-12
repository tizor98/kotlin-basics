fun main() {

    // Lista inmutable
    val nameList = listOf("Juan", "Enrique", 2)
    println(nameList)
    println(nameList.joinToString(", "))

    // Lista mutable
    val voidList = mutableListOf<String>()
    println(voidList)
    voidList.add("Alberto")
    println(voidList[0])
    println(voidList.firstOrNull())
    voidList.removeAt(0)
    println(voidList)

    // Arrays, para mayor performance
    val myArray = arrayOf(1,2,3,4,5)
    println(myArray.size)

    // Ordenar listas
    val lotteryNumbers = listOf(99,88,77,11,22,33,44,55,66)
    println(lotteryNumbers.sorted())
    println(lotteryNumbers.sortedDescending())
    println(lotteryNumbers.sortedBy { num -> num < 50 })
    println(lotteryNumbers.shuffled())
    println(lotteryNumbers.shuffled())
    println(lotteryNumbers.reversed())

    println(lotteryNumbers.filter { num -> num > 50 }.map { num -> {
        "$num" // automáticamente retorna última línea
    } })

}