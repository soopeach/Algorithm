fun main(){

    val n = readln().toInt()
    var prize = 0

    repeat(n){

        val (a, b, c) = readln().split(" ").map { it.toInt() }
        var curPrize = 0

        if (a == b && b == c){
            curPrize = 10000 + a * 1000
        } else if (a != b && a != c && b != c){
            var bigger = if (a > b) a else b
            curPrize = (if (bigger > c) bigger else c) * 100
        } else {
            if (a == b){
                curPrize = 1000 + a * 100
            } else if (b == c){
                curPrize = 1000 + b * 100
            } else {
                curPrize = 1000 + c * 100
            }
        }

        if (curPrize > prize) prize = curPrize
    }

    println(prize)
}