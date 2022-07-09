fun main() {
    while (true) {
        val string = readln()
        if (string == "-1") break
        val numList = string.split(" ").map { it.toInt() }
        var ansCnt = 0

        for (i in 0 until numList.size - 1) {
            val mainNum = numList[i]
            for (j in 0 until numList.size - 1) {
                val comparator = numList[j]
                if (mainNum * 2 == comparator) {
                    ansCnt++
                }
            }
        }
        println(ansCnt)
    }
}


