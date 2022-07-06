fun main() {

    val (n, d) = readln().split(" ").map { it.toInt() }
    var frequency = 0

    for (no in 1..n) {
        no.toString().forEach {
            var num = it - '0'
            if (num == d) frequency++
        }
    }
    println(frequency)
}



