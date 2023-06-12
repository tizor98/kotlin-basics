fun main() {

    // Mapa inmutable
    val yearsOld = mapOf(
        "Ironman" to 35,
        "Spider-man" to 23,
        "Capitan America" to 99
    )
    println(yearsOld)

    // Mapa mutable
    val mutYearsOld = mutableMapOf<String, Int>()
    mutYearsOld.put("Ironman", 35)
    mutYearsOld["Spider-man"] = 23
    mutYearsOld["Capitan America"] = 99
    println(mutYearsOld)
    println(mutYearsOld["Ironman"])
    mutYearsOld.remove("Capitan America")
    println(mutYearsOld)
    println(mutYearsOld.keys)
    println(mutYearsOld.values)

    // Set inmutable
    val set = setOf(1,1,1,2,3,4,5,5,5,5,5,5,5)
    println(set)

    // Set mutable
    val mutSet = mutableSetOf<Int>()
    mutSet.add(2)
    mutSet.add(2)
    mutSet.add(2)
    mutSet.add(3)
    println(mutSet)

}