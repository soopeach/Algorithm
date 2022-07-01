val n = readln().toInt()
val visited = BooleanArray(n + 1, { false })
val pickedList = mutableListOf<Int>()
fun main() {
    permutation(0, n)
}

fun permutation(cnt: Int, depth: Int) {

    if (cnt == depth) {
        pickedList.forEach {
            print("$it ")
        }
        println()
        return
    }
    for (index in 1..n) {
        if (visited[index]) continue

        visited[index] = true
        pickedList.add(index)
        permutation(cnt + 1, depth)
        pickedList.removeAt(pickedList.lastIndex)
        visited[index] = false
    }
}
