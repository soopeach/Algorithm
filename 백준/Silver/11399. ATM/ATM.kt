fun main() {
    var ans = 0

    val size = readln().toInt()
    val timeList = readln().split(" ").map { it.toInt() }.sorted().toIntArray()

    for (index in 0 until timeList.size) {
        for (time in 0..index) {
            ans += timeList[time]
        }
    }

    println(ans)

}