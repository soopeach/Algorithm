fun main() {

    val (e, s, m) = readln().split(" ").map { it.toInt() }
    var myE = 1
    var myS = 1
    var myM = 1
    var year = 1

    while (e != myE || s != myS || m != myM) {
        myE++
        if (myE > 15) myE = 1
        myS++
        if (myS > 28) myS = 1
        myM++
        if (myM > 19) myM = 1
        year++
    }

    println(year)

}

