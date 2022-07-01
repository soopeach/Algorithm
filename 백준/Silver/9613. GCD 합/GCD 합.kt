fun main() {

    val t = readln().toInt()

    repeat(t) {
        var ans = 0L
        val nList = readln().split(" ")
            .map { it.toInt() }.filterIndexed { index, it -> index != 0 }
            .toList().sortedDescending()

        for (firNum in 0 until nList.size) {
            for (secNum in firNum + 1 until nList.size) {
                ans += euclid(nList[firNum], nList[secNum])
            }
        }
        println(ans)
    }
}

fun euclid(a: Int, b: Int): Int {

    if (b == 0) return a
    else return euclid(b, a % b)

}

