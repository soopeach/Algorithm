fun main() {

    val firNum = readln().toInt()
    var maxSizeList = mutableListOf<Int>()

    for (no in firNum downTo 1) {

        var curList = mutableListOf<Int>()
        curList.add(firNum)
        curList.add(no)

        // 빼고 남을 수
        var remainNum = firNum - no

        while (true) {
            remainNum = curList[curList.lastIndex - 1] - curList[curList.lastIndex]
            if (remainNum < 0) break
            curList.add(remainNum)
        }

        if (curList.size > maxSizeList.size) maxSizeList = curList

    }

    maxSizeList.forEachIndexed { index, it ->
        if (index == 0) println(maxSizeList.size)
        print("$it ")
    }

}

