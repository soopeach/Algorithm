fun main() {

    var (n, k) = readln().split(" ").map { it.toInt() }

    val coinList = mutableListOf<Int>()
    var ans = 0
    repeat(n) {
        coinList.add(readln().toInt())
    }

    // 내림차순 정렬
    coinList.sortedByDescending { it }.forEach {
        val coinCnt = k / it
        if (coinCnt > 0) {
            ans += coinCnt
            k -= coinCnt * it
        }
    }
    println(ans)
}