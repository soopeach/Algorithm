fun main(){

    val (n, k) = readln().split(" ").map { it.toInt() }
    var max = 0

    for(multiple in 1 .. k){
        val reversedNum = (n * multiple).toString().reversed().toInt()
        if(reversedNum > max) max = reversedNum
    }

    print(max)
}