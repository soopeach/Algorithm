import java.io.*
import java.util.*

fun main(){

    val maxHeap = PriorityQueue<Int>(reverseOrder())

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    repeat(readln().toInt()){

        val x = br.readLine()!!.toInt()

        // x가 0이라면 배열에서 가장 큰 값을 출력하고 제거
        if (x == 0) {
            if (maxHeap.isEmpty()) bw.write("0\n")
            else {
                bw.write("${maxHeap.poll()}\n")
            }
        } else {
            maxHeap.add(x)
        }
    }
    bw.flush()
    bw.close()
}