fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val evenNumbers = list.filter { it % 2 == 0 }
    list.removeAll(evenNumbers)
    println(list) // Output: [1, 3, 5]

    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    val evenEntries = map.filterValues { it % 2 == 0 }
    evenEntries.forEach{ map.remove(it.key)}
    println(map) // Output: {a=1, c=3}

    //Alternative solution using toMutableList()
    val map2 = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    map2.entries.toMutableList().removeAll { it.value % 2 == 0 }
    println(map2) // Output: {a=1, c=3}
} 