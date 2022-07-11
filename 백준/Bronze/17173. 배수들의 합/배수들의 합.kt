fun main() {

    val (n, m) = readln().split(" ").map { it.toInt() }
    val kList = readln().split(" ").map { it.toInt() }

    var sumOfMultiple = 0
    
    for (no in 1..n) {
        var isMultiple = false
        for (index in 0 until kList.size) {
            if (no % kList[index] == 0) {
                isMultiple = true
                break
            }
        }
        if (isMultiple) sumOfMultiple += no
    }
    println(sumOfMultiple)
}