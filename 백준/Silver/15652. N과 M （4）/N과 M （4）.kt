import java.io.BufferedWriter
import java.io.OutputStreamWriter

var numList = intArrayOf()
val pickedNumList = mutableListOf<Int>()
val ansList = mutableListOf<MutableList<Int>>()
val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() {

    val (n, m) = readln().split(" ").map { it.toInt() }

    for (no in 0..n) {
        numList += no
    }

    dfs(0, m)
    bw.flush()
    bw.close()

}

fun dfs(cnt: Int, depth: Int) {
    if (cnt == depth) {
        bw.write("${pickedNumList.joinToString(" ")}\n")
        return
    }
    for (index in 1 until numList.size) {
        if (pickedNumList.isNotEmpty()) {
            if (pickedNumList[pickedNumList.lastIndex] <= numList[index]) {
                pickedNumList.add(numList[index])
                dfs(cnt + 1, depth)
                pickedNumList.removeAt(pickedNumList.lastIndex)
            }
        } else {
            pickedNumList.add(numList[index])
            dfs(cnt + 1, depth)
            pickedNumList.removeAt(pickedNumList.lastIndex)
        }

    }
}


