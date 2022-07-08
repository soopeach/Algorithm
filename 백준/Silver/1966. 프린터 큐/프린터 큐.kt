import java.util.*

fun main() {

    val queue: Queue<Pair<Int, Int>> = LinkedList()
    val t = readln().toInt()

    repeat(t) {

        // 문서의 개수, 몇 번째로 인쇄되었는지 궁금한 문서
        val (n, m) = readln().split(" ").map { it.toInt() }

        // 문서의 중요도를 입력 받아 (문서의 번호, 문서의 중요도) 순으로 쌍을 만들어줌.
        val documents = readln().split(" ").mapIndexed { index, it -> Pair(index, it.toInt()) }
        var printedCnt = 0

        documents.forEach {
            queue.add(it)
        }

        while (true) {

            val poll = queue.poll()
            var canPrint = true

            // 우선순위가 더 높은게 있으면 다시 뒤로 넣기
            queue.forEach {
                if (poll.second < it.second) canPrint = false
            }

            if (canPrint) {
                printedCnt++
                if (poll.first == m) {
                    println(printedCnt)
                    break
                }
            } else {
                queue.add(poll)
            }
        }
        queue.clear()
    }
}