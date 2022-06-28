import java.util.PriorityQueue

fun main() {

    val heap = PriorityQueue<Int>()

    repeat(readln().toInt()) {

        val num = readln().toInt()

        if (num == 0) {
            if (heap.isNotEmpty()) println(heap.poll())
            else println(0)
        } else {
            heap.add(num)
        }
    }
}


