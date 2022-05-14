import kotlin.math.abs

val size = readln().toInt()
val num = readln().split(" ").map { it.toInt() }
val visited = BooleanArray(num.size, { false })
val result = mutableListOf<Int>()
var ans = 0
fun main() {

    permutation(0)
    println(ans)

}

fun permutation(cnt: Int) {
    if (cnt == size) {
        if (forAns(result) > ans) ans = forAns(result)
        return
    }
    for (i in 0 until num.size) {
        if (visited[i] == false) {
            visited[i] = true
            result.add(num[i])
            permutation(cnt + 1)
            result.removeAt(result.lastIndex)
            visited[i] = false

        }
    }
}

fun forAns(array: MutableList<Int>): Int {
    var ans = 0
    for (index in 2..array.size) {
        ans += abs(array[index - 2] - array[index - 1])
    }
    return ans
}