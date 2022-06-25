import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    // 빠른 입출력
    val br = BufferedReader(InputStreamReader(System.`in`))
    var queue : MutableList<Pair<Int, Boolean>>

    // 테스트 케이스만큼 반복
    repeat(br.readLine().toInt()) {
        queue = mutableListOf<Pair<Int, Boolean>>()
        // [0] 문서의 개수, [1] 몇 번째로 인쇄되었는지 궁금한 문서의 현재 Queue에서의 위치
        val inform = br.readLine().split(" ")
        val doc = br.readLine().split(" ")

        // 문서를 순서대로 큐에 넣어줌.
        doc.forEachIndexed { index, doc ->
            // 몇 번째로 인쇄되었는지 궁금한 문서라면 true, 아니라면 false와 같이 넣어줌.
            if (index == inform[1].toInt()) queue.add(Pair(doc.toInt(), true))
            else queue.add(Pair(doc.toInt(), false))
        }

        println(countPrint(queue))

    }


}

fun countPrint(queue: MutableList<Pair<Int, Boolean>>): Int {
    var cnt = 0;

    while (true in queue.map { it.second }) {
        // queue에 있는 가장 앞에있는 문서의 우선순위가 가장 높은게 아니라면
        if (queue.get(0).first != Collections.max(queue.map { it.first })) {
            queue.add(Pair(queue.get(0).first, queue.get(0).second))
            queue.removeAt(0)
        } else if (queue.get(0).first == Collections.max(queue.map { it.first })) {
            cnt++
            queue.removeAt(0)
        }
    }

    return cnt
}