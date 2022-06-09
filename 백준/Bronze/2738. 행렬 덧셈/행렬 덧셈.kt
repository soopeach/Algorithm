fun main() {

    val (n, m) = readln().split(" ").map { it.toInt() }

    val firMatrix = mutableListOf<MutableList<Int>>()
    val secMatrix = mutableListOf<MutableList<Int>>()

    repeat(2) { firOrSec ->

        // 첫 번째 행렬에 값 넣기
        if (firOrSec == 0) {
            repeat(n) {
                firMatrix.add(readln().split(" ").map { it.toInt() }.toMutableList())
            }
            // 두 번째 행렬에 값 넣기
        } else {
            repeat(n) {
                secMatrix.add(readln().split(" ").map { it.toInt() }.toMutableList())
            }
        }
    }

    for (i in 0 until n) {
        for (j in 0 until m) {
            print("${firMatrix[i][j] + secMatrix[i][j]} ")
        }
        println()
    }
}