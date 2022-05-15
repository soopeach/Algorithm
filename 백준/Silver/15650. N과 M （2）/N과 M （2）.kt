val sizeAndDepth = readln().split(" ").map { it.toInt() }
val numList = mutableListOf<Int>()
val visited = BooleanArray(sizeAndDepth[0], { false })
val perElement = mutableListOf<Int>()

fun main() {
    for (no in 0 until sizeAndDepth[0]) {
        numList.add(no + 1)
    }

    combination(0, sizeAndDepth[1], 0)
}

fun combination(cnt : Int, depth: Int, beginWith : Int){
    if (cnt == depth){
        perElement.forEach {
            print("$it ")
        }
        println()
        return
    }
    for (cur in beginWith until numList.size){
        perElement.add(numList[cur])
        combination(cnt+1, depth, cur+1)
        perElement.removeAt(perElement.lastIndex)
    }
}