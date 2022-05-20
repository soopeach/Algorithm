import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val sizeAndK = readln().split(" ").map { it.toInt() }

    br.readLine().split(" ").map { it.toInt() }
        .sorted()
        .forEachIndexed { index, num ->
            if (index == sizeAndK[1] - 1) {
                bw.write("$num")
                return@forEachIndexed
            }
        }
    bw.flush()
    bw.close()
}