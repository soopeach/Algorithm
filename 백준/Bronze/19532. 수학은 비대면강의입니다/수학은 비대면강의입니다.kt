fun main() {

    // a, b, c, d, e, f
    val list = readln().split(" ").map { it.toInt() }

    for (x in -999..999) {
        for (y in -999..999) {
            if (list[0] * x + list[1] * y == list[2]
                && list[3] * x + list[4] * y == list[5]
            ) {
                println("$x $y")
                return
            }
        }
    }
    
}

