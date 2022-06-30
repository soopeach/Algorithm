fun main(){

    var (n, m) = readln().split(" ").map{ it.toInt() }

    var castle = mutableListOf<MutableList<Char>>()
    var rowGuard = 0
    var colGuard = 0

    repeat(n){
        val row = readln().toMutableList()
        castle.add(row)
    }

    for(i in 0 until n){
        var hasGuard = false
        for(j in 0 until m){
            if(castle[i][j] == 'X'){
                hasGuard = true
                break
            }
        }
        if(!hasGuard) {
            rowGuard++
        }
    }

    for(i in 0 until m){
        var hasGuard = false
        for(j in 0 until n){
            if(castle[j][i] == 'X'){
                hasGuard = true
                break
            }
        }
        if(!hasGuard) {
            colGuard++
        }
    }


    if(colGuard > rowGuard) println(colGuard)
    else println(rowGuard)
}