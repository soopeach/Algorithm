fun main() {

    val originChess = intArrayOf(1, 1, 2, 2, 2, 8)
    val foundChess = readln().split(" ").map { it.toInt() }
    var needChess = intArrayOf()

    originChess.forEachIndexed { index, it ->
        needChess += it - foundChess[index]
    }

    needChess.forEach {
        print("$it ")
    }
}