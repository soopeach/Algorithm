fun main() {

    var t = readln().toInt()

    val threeBtnsCnt = intArrayOf(0,0,0)
    val threeBtns = intArrayOf(300,60,10)
    repeat(3){index ->
        threeBtnsCnt[index] = t / threeBtns[index]
        t %= threeBtns[index]
    }

    if(t == 0) threeBtnsCnt.forEach{ print("$it ")}
    else println(-1)
}







