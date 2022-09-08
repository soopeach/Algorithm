fun main() {

    val cnt = readln().toInt()

    val numList = mutableListOf<String>()
    repeat(cnt) {
        numList.add(readln().reversed())
    }
    var index = 1
    while (true) {
        val slicedList = mutableListOf<String>()
        numList.forEach {
            slicedList.add(it.substring(0, index))
        }

        if (slicedList.toSet().size != numList.size) {
            index++
        } else {
            println(index)
            return
        }
    }

}



