fun main() {

    val n = readln()
    val f = readln().toInt()
    val exceptedN = n.substring(0, n.length - 2)

    for (no in 0..99) {
        var curNum = exceptedN
        if (no >= 0 && no <= 9) {
            curNum += "0$no"
        } else {
            curNum += no.toString()
        }

        if (curNum.toInt() % f == 0) {
            if (no / 10 == 0) {
                println("0$no")
            } else println(no)
            return
        }
    }

}