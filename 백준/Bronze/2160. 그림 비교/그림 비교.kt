fun main() {

    var paintingCnt = readln().toInt()
    val paintingList = mutableListOf<MutableList<MutableList<Char>>>()

    var minDiffCnt = 36
    val diffNumList = IntArray(2, { 0 })

    repeat(paintingCnt) {

        val curList = mutableListOf<MutableList<Char>>()

        for (line in 0 until 5) {
            var curLine = readln().toMutableList()
            curList.add(curLine)
        }
        paintingList.add(curList)
    }

    for (i in 0 until paintingCnt) {
        for (j in i + 1 until paintingCnt) {
            val curDiffCnt = diffCnt(paintingList[i], paintingList[j])
            if (curDiffCnt < minDiffCnt) {
                minDiffCnt = curDiffCnt
                diffNumList[0] = i + 1
                diffNumList[1] = j + 1
            }
        }
    }

    diffNumList.forEach {
        print("$it ")
    }

}

fun diffCnt(firPainting: MutableList<MutableList<Char>>, secPainting: MutableList<MutableList<Char>>): Int {
    var diffCnt = 0
    for (i in 0 until 5) {
        for (j in 0 until 7) {
            if (firPainting[i][j] != secPainting[i][j]) diffCnt++
        }
    }
    return diffCnt
}

