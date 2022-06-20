fun main() {

    val s = readln().toLong()

    // 자연수 N의 최댓값
    var maxOfN = 0L
    // 이분탐색의 시작점
    var start = 1L
    // 이분탐색의 끝점.
    var end = s

    // 이분 탐색
    while (start <= end) {
        var mid = (start + end) / 2

        if (sum(mid) == s) {
            maxOfN = mid
            break
        } else if (sum(mid) <= s) {
            maxOfN = mid
            start = mid + 1
        } else {
            end = mid - 1
        }
    }

    println(maxOfN)

}

fun sum(n: Long): Long {
    return n * (n + 1) / 2
}