val flavorList = mutableListOf<Pair<Int, Int>>()
val ingredientsCnt = readln().toInt()
val pickedList = mutableListOf<Pair<Int, Int>>()
var minDiffOfCook = 1000000000
fun main() {

    repeat(ingredientsCnt) {
        val curFlavor = readln().split(" ").map { it.toInt() }
        flavorList.add(Pair(curFlavor[0], curFlavor[1]))
    }

    for (depth in 1..ingredientsCnt) {
        subSet(0, depth, 0)
    }

    println(minDiffOfCook)

}

fun subSet(cnt: Int, depth: Int, beginWith: Int) {

    if (cnt == depth) {
        var curSourSum = 0
        var curBitterSum = 0
        pickedList.forEachIndexed { index, flavor ->
            if (index == 0) {
                curSourSum += flavor.first
                curBitterSum += flavor.second
            } else {
                curSourSum *= flavor.first
                curBitterSum += flavor.second
            }
        }

        var curDiffOfCook = 0
        if (curSourSum >= curBitterSum) {
            curDiffOfCook = curSourSum - curBitterSum
        } else {
            curDiffOfCook = curBitterSum - curSourSum
        }

        if (curDiffOfCook < minDiffOfCook) minDiffOfCook = curDiffOfCook
    }
    for (index in beginWith until ingredientsCnt) {
        pickedList.add(flavorList[index])
        subSet(cnt + 1, depth, index + 1)
        pickedList.removeAt(pickedList.lastIndex)
    }
}


