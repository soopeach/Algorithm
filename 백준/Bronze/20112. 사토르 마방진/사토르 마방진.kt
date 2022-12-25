fun main() {

    val cnt = readln().toInt()
    val wordList = mutableListOf<String>()

    repeat(cnt) {
        wordList.add(readln())
    }

    for (i in 0 until cnt) {

        var horizontal = ""
        var vertical = ""
        for (j in 0 until cnt) {
            horizontal += wordList[i][j]
            vertical += wordList[j][i]
        }
        if (horizontal != vertical) {
            println("NO")
            return
        }
    }

    println("YES")

}