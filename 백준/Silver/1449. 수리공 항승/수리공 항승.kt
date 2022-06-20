fun main() {

    // 물이 새는 곳의 개수 n, 테이프의 길이 l
    val (n, l) = readln().split(" ").map { it.toInt() }

    // 누수된 곳
    val whereLeaked = readln().split(" ").map { it.toInt() }.sorted()

    // 필요한 테이프의 개수
    var needTape = 0

    var lastLocation = 0f
    whereLeaked.forEachIndexed { index, location ->

        if (index == 0) {
            lastLocation = location - 0.5f
            needTape++
            return@forEachIndexed
        }

        if ((lastLocation + l) < location) {
            lastLocation = location - 0.5f
            needTape++
        }


    }

    println(needTape)
    
}