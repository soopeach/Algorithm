fun main(){

    var qList = IntArray(5,{0})

    repeat(readln().toInt()) {

        val (x, y) = readln().split(" ").map { it.toInt() }

        // 축
        if (x == 0 || y == 0) qList[4]++
        // 1사분면
        else if (x > 0 && y > 0) qList[0]++
        // 2사분면
        else if (x < 0 && y > 0) qList[1]++
        // 3사분면
        else if (x < 0 && y < 0) qList[2]++
        // 4사분면
        else qList[3]++
    }
    qList.forEachIndexed { index, it ->

        if (index == 4){
            println("AXIS: $it")
        } else {
            println("Q${index+1}: $it")
        }
    }
}