fun main() {

    val n = readln().toInt()
    var maxGoldMinSoo = 0

    for (no in 4..n) {
        var isGoldMinSoo = true
        no.toString().forEach {
            if (it != '4' && it != '7') {
                isGoldMinSoo = false
            }
        }
        if (isGoldMinSoo) maxGoldMinSoo = no
    }
    println(maxGoldMinSoo)
}

