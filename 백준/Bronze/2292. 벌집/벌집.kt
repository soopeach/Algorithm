fun main(){

    val N = readLine()!!.toInt()
    var n = 1

    while (N != 1){

        if (first(n) <= N && N <= second(n)) {
            break
        } else n++

    }
    print(n)

}
fun first(n : Int) : Int{ return (3 * n * n) - 9 * n + 8}
fun second(n : Int) : Int { return (3 * n * n) - 3 * n + 1}