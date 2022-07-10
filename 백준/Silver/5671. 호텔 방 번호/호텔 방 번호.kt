import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    while (true) {
        val data = br.readLine() ?: break
        val (start, end) = data.split(" ").map { it.toInt() }

        var numSet = mutableSetOf<Char>()
        var roomCnt = 0
        for (roomNum in start..end) {
            var canMake = true
            roomNum.toString().forEach {
                if (!numSet.add(it)) canMake = false
            }
            if (canMake) roomCnt++
            numSet.clear()
        }
        println(roomCnt)
    }

}


