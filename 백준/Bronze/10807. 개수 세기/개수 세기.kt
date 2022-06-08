fun main(){
    val n = readln().toInt()
    val array = readln().split(" ").map { it.toInt() }.toIntArray()
    val v = readln().toInt()
    var ans = 0
    array.forEach {
        if (it == v) ans++
    }
    print(ans)
}