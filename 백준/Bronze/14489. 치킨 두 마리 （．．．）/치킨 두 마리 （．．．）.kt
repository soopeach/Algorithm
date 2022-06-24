fun main(){

    val (a, b) = readln().split(" ").map { it.toLong() }
    val c = readln().toLong()

    if(a + b - 2 * c >= 0)
        println(a + b - 2 * c)
    else
        println(a + b)
}