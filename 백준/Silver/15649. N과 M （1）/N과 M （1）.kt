val sizeAndDepth = readln().split(" ").map { it.toInt() }
val numList = mutableListOf<Int>()
val visited = BooleanArray(sizeAndDepth[0], { false })
val perElement = mutableListOf<Int>()

fun main() {
    for (no in 0..sizeAndDepth[0]) {
        numList.add(no + 1)
    }
    permutation(0, sizeAndDepth[1])
}

fun permutation(cnt: Int, depth: Int) {

    if (cnt == depth) {
        perElement.forEach {
            print("$it ")
        }
        println()
        return
    }
    for (index in 0 until sizeAndDepth[0]) {
        if (visited[index] == false) {
            visited[index] = true
            perElement.add(numList[index])
            permutation(cnt + 1, depth)
            perElement.removeAt(perElement.lastIndex)
            visited[index] = false
        }
    }
}