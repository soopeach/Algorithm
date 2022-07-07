fun main() {

    val n = readln().toInt()

    for (no in 1..100) {
        if (no + no * no + 1 == n) println(no)
    }
}


