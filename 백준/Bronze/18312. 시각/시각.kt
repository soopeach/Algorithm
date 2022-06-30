fun main() {

    val (n, k) = readln().split(" ").map { it.toInt() }
    var sec = 0
    var min = 0
    var hour = 0

    var ans = 0
    while (hour <= n) {

        val secFir = sec / 10
        val secSec = sec % 10

        val minFir = min / 10
        val minSec = min % 10

        val hourFir = hour / 10
        val hourSec = hour % 10

        if (secFir == k || secSec == k
            || minFir == k || minSec == k
            || hourFir == k || hourSec == k
        ) ans++

        sec++

        var needToUp = false
        if (sec >= 60) {
            sec -= 60
            needToUp = true
        }

        if (needToUp) {
            min++
            needToUp = false
        }

        if (min >= 60) {
            min -= 60
            needToUp = true
        }

        if (needToUp) {
            hour++
        }

    }

    print(ans)
}


