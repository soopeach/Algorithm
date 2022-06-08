fun main() {

    val cnt = readln().toInt()
    val clothesData = mutableMapOf<String, Int>()
    
    repeat(cnt) { cnt ->

        clothesData.clear()
        repeat(readln().toInt()) {
            val (value, key) = readln().split(" ")
            clothesData.put(key, clothesData.getOrDefault(key, 0) + 1)
        }

        val ans = clothesData.map { it.value }.fold(1) { total, next ->
            total * (next + 1)
        }
        println(ans - 1)
    }
}