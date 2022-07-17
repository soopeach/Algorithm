fun main() {

    val t = readln()
    val numList = readln().split(" ").map { it.toInt() }

    for (index in 0 until numList.size) {
        isPerfect(numList[index])
    }
}

fun isPerfect(n: Int) {
    val divisor = mutableListOf<Int>()

    for (divider in 1 until n) {
        if (n % divider == 0) divisor.add(divider)
    }

    val sumOfDivisor = divisor.sum()

    if (sumOfDivisor == n) println("Perfect")
    else if (sumOfDivisor > n) println("Abundant")
    else println("Deficient")
}
