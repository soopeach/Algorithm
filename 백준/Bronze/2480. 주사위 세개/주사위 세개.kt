fun main() {

    // 주사위
    val (a, b, c) = readln().split(" ").map { it.toInt() }
    
    // 상금
    var prize = 0
    
    // 같은 눈이 3개 나옴.
    if (a == b && b == c) {
        prize = 10000 + a * 1000
        // 모두 다를 경우
    } else if (a != b && a != c && b != c) {
        prize = whatIsMax(a, b, c) * 100
        // 같은 눈이 2개 나옴.
    } else {
        prize = 1000 + whatIsSame(a, b, c) * 100
    }

    println(prize)
}

fun whatIsMax(a: Int, b: Int, c: Int): Int {
    var max = if (a > b) a else b
    max = if (max > c) max else c
    return max
}

fun whatIsSame(a: Int, b: Int, c: Int): Int {
    if (a == b) return a
    if (b == c) return b
    return c
}
