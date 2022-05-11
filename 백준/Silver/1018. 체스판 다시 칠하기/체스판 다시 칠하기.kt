fun main() {
    val size = readln().split(" ")
    val row = size[0].toInt()
    val col = size[1].toInt()
    var ans = 64

    val board = mutableListOf<String>()
    repeat(row) {
        var input = readln()
        board.add(input)
    }

    for (h in 0..row - 8) {

        for (w in 0..col - 8) {

            var newBoard = mutableListOf<String>()
            board.subList(h, h + 8).forEach {
                newBoard.add(it.substring(w, w + 8))
            }

            if (ans > startWhite(newBoard)) ans = startWhite(newBoard)
            if (ans > startBlack(newBoard)) ans = startBlack(newBoard)

        }

    }

    print(ans)

}

fun startWhite(board: MutableList<String>): Int {
    val std = arrayOf<String>(
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW"
    )
    var cnt = 0
    for (row in 0 until 8) {

        for (col in 0 until 8) {
            if (std[row][col] != board[row][col]) cnt++
        }
    }

    return cnt
}

fun startBlack(board: MutableList<String>): Int {
    val std = arrayOf<String>(
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB"
    )
    var cnt = 0
    for (row in 0 until 8) {

        for (col in 0 until 8) {
            if (std[row][col] != board[row][col]) cnt++
        }
    }

    return cnt
}
