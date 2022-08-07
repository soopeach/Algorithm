import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val regex = """\w+"""
    val firList = mutableSetOf<Char>()
    while (true) {
        val line = br.readLine()
        if (line == "*") break

        line.split(" ").forEach {
            firList.add(it[0].uppercaseChar())
        }

        if (firList.size == 1) println("Y")
        else {
            println("N")
        }
        firList.clear()
    }
}
