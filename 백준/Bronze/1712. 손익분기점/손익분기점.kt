fun main() {

    val (a, b, c) = readln().split(" ").map { it.toLong() }

    var used = a
    var get = 0L
    var cnt = 0L
    
    if (b >= c) {
        print(-1)
        return
    }
    while (used >= get) {
        used += b
        get += c
        cnt++
    }
    
    print(cnt)

}







