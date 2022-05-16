fun main() {
    val num = readln().split(" ").map { it.toLong() }
    println("${(num[0] + num[1]) * (num[0] - num[1])}")
}