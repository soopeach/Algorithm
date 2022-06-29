fun main(){

    while (true){
        val ans = readln().split(' ').map { it.toInt() }.sum()
        if (ans == 0) break
        println(ans)
    }

}

