fun main() {

    val sum = readln().toInt()
    val cnt = readln().toInt()
    var result = 0
    
    repeat(cnt) {
        result += readln().split(" ").fold(1) { total, next ->
            total * next.toInt()
        }
    }
    if (sum == result) println("Yes")
    else println("No")
}