fun main() {

    val n = readln().toInt()
    var ans = 0

    for (no in 1 .. n) {
        if (n % no == 0) ans += no
    }
    println(ans * 5 - 24)
}


