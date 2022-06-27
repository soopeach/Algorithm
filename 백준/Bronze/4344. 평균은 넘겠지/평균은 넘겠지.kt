fun main() {

    repeat(readln().toInt()) {

        // 맨 첫번째 값은 학생의 수 그 뒤는 성적들
        val list = readln().split(" ").map { it.toInt() }

        // 성적의 합
        val sum = list
            .filterIndexed { index, i -> index != 0 }
            .sumOf { it }

        // 평균
        val avg = sum / list[0]

        var ans = 0

        list.subList(1, list.size).forEach {
            if (it > avg) ans++
        }

        println(String.format("%.3f", ans.toDouble() * 100 / list[0]) + "%")

    }
}