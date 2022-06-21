fun main() {

    val (k, d, a) = readln().split("/").map { it.toInt() }

    if (k + a < d || d == 0) println("hasu")
    else println("gosu")
}

