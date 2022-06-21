fun main() {

    val (n, m) = readln().split(" ").map { it.toInt() }
    val stringList = mutableListOf<String>()

    repeat(n) {
        stringList.add(readln().reversed())
    }
    
    stringList.forEach {
        println(it)
    }
}

