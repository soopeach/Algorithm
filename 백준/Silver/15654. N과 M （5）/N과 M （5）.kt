import java.io.BufferedWriter
import java.io.OutputStreamWriter

var numList = intArrayOf()
val pickedNumList = mutableListOf<Int>()
val ansList = mutableListOf<MutableList<Int>>()
val bw = BufferedWriter(OutputStreamWriter(System.out))
lateinit var visited: BooleanArray
fun main() {

    val (n, m) = readln().split(" ").map { it.toInt() }

    numList = readln().split(" ").map { it.toInt() }.sorted().toIntArray()
    visited = BooleanArray(n, { false })
    dfs(0, m)
    bw.flush()
    bw.close()

}

fun dfs(cnt: Int, depth: Int) {
    if (cnt == depth) {
        bw.write("${pickedNumList.joinToString(" ")}\n")
        return
    }
    for (index in 0 until numList.size) {
        if (visited[index] == false) {
            visited[index] = true
            pickedNumList.add(numList[index])
            dfs(cnt + 1, depth)
            visited[index] = false
            pickedNumList.removeAt(pickedNumList.lastIndex)
        }
    }
}


