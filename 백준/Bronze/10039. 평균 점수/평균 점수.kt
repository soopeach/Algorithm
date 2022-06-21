fun main() {

    var averageScore = 0
    repeat(5) {
        val score = readln().toInt()
        averageScore += if (score >= 40) score else 40
    }

    println(averageScore / 5)
}

