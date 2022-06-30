fun main() {

    val n = readln().toInt()
    val board = mutableListOf<MutableList<Char>>()

    var canEatMax = 0
    // 보드에 정보를 입력받는 과정
    repeat(n) {
        val row = readln().toMutableList()
        board.add(row)
    }

    // 완전 탐색을 진행
    for (i in 0 until n) {
        for (j in 0 until n) {

            // 현재 좌표의 사탕 모양
            val curChar = board[i][j]

            // 범위 내에서만
            if (i + 1 < n) {
                val belowChar = board[i + 1][j]
                // 아래와 다를 때
                if (curChar != belowChar) {
                    // 사탕 위치 바꾸기
                    board[i][j] = belowChar
                    board[i + 1][j] = curChar
                    var canEatCnt = checkCanEatCnt(board)
                    if (canEatMax < canEatCnt) canEatMax = canEatCnt
                    // 사탕 위치 복구
                    board[i][j] = curChar
                    board[i + 1][j] = belowChar

                }
            }

            // 범위 내에서만
            if (j + 1 < n) {
                val rightChar = board[i][j + 1]
                // 우측과 다를 때
                if (curChar != rightChar) {
                    // 사탕 위치 바꾸기
                    board[i][j] = rightChar
                    board[i][j + 1] = curChar
                    var canEatCnt = checkCanEatCnt(board)
                    if (canEatMax < canEatCnt) canEatMax = canEatCnt
                    // 사탕 위치 복구
                    board[i][j] = curChar
                    board[i][j + 1] = rightChar
                }
            }

        }
    }

    print(canEatMax)

}

fun checkCanEatCnt(board: MutableList<MutableList<Char>>): Int {

    var maxCnt = 0

    //  가로
    for (i in 0 until board.size) {
        var curRowCnt = 1
        var lastChar = board[i][0]
        for (j in 1 until board.size) {
            var curChar = board[i][j]

            // 현재 단어와 이전 단어가 같다면
            if (lastChar == curChar) {
                curRowCnt++
            } else {
                lastChar = curChar
                if (maxCnt < curRowCnt) maxCnt = curRowCnt
                curRowCnt = 1
            }
        }
        if (maxCnt < curRowCnt) maxCnt = curRowCnt
        curRowCnt = 1

    }

    // 세로
    for (i in 0 until board.size) {
        var curColCnt = 1
        var lastChar = board[0][i]
        for (j in 1 until board.size) {
            var curChar = board[j][i]

            if (lastChar == curChar) {
                curColCnt++
            } else {
                lastChar = curChar
                if (maxCnt < curColCnt) maxCnt = curColCnt
                curColCnt = 1
            }
        }
        if (maxCnt < curColCnt) maxCnt = curColCnt
        curColCnt = 1

    }

    return maxCnt
}








