fun main(){
    var ans = 0
    readln().forEach {
        ans += nPowerFive(it - '0')
    }
    println(ans)
}

fun nPowerFive(n: Int): Int{
    return n * n * n * n * n
}