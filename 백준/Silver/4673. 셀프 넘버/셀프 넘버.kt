fun main() {
    val exceptedList = mutableListOf<Int>()

    for (no in 1..10000) {
        // 네 자리 수 일경우
        if (no / 1000 > 0) {
            val fourth = no / 1000
            val third = (no % 1000) / 100
            val second = (no % 100) / 10
            val first = (no % 10)
            exceptedList.add(no + fourth + third + second + first)

        } else if (no / 100 > 0) {
            val third = no / 100
            val second = (no % 100) / 10
            val first = (no % 10)
            exceptedList.add(no + third + second + first)
        } else if (no / 10 > 0) {
            exceptedList.add(no + (no / 10) + (no % 10))
        } else {
            exceptedList.add(no + no)
        }
    }

    for (no in 1..10000) {
        if (!(exceptedList.contains(no))) println(no)
    }
}
