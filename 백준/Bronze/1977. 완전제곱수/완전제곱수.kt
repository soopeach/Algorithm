fun main(){

    val m = readln().toInt()
    val n = readln().toInt()

    var sum = 0
    var min = 10000
    (m..n).forEach{
        if(isPerfectSquare(it)){
            sum += it
            if (min > it) min = it
        }
    }

    if(sum != 0){
        println(sum)
        println(min)
    } else println(-1)

}

fun isPerfectSquare(x: Int): Boolean{

    var isPerfectSquare = false

    if(x == 1) return true
    for(no in 2 until x){
        if (no * no == x){
            isPerfectSquare = true
            break
        }
    }

    return isPerfectSquare

}

