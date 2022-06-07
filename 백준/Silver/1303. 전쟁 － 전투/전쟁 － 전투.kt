fun main() {

    val (n, m) = readln().split(" ").map { it.toInt() }
    val battleGround = mutableListOf<MutableList<Char>>()
    var enemyPower = 0
    var myPower = 0

    repeat(m) {
        battleGround.add(readln().toMutableList())
    }

    for (x in 0 until m) {
        for (y in 0 until n) {
            // 아군일 때
            if (battleGround[x][y] == 'W') {
                val cnt = bfs(x, y, battleGround, 'W')
                myPower += cnt * cnt
                // 적군일 때
            } else {
                val cnt = bfs(x, y, battleGround, 'B')
                enemyPower += cnt * cnt
            }
        }
    }

    println("$myPower $enemyPower")
}

fun bfs(x: Int, y: Int, battleGround: MutableList<MutableList<Char>>, start: Char): Int {
    var ans = 0
    val h = battleGround.size
    val w = battleGround[0].size

    // 범위를 넘어가면 탐색 종료
    if (x < 0 || x >= h || y < 0 || y >= w) return 0
    // 이미 탐색한 곳이라면 탐색 종료
    if (battleGround[x][y] == 'C') return 0
    if (start == 'W' && battleGround[x][y] == 'B') return 0
    if (start == 'B' && battleGround[x][y] == 'W') return 0

    battleGround[x][y] = 'C'
    ans++

    ans += bfs(x + 1, y, battleGround, start)
    ans += bfs(x, y + 1, battleGround, start)
    ans += bfs(x - 1, y, battleGround, start)
    ans += bfs(x, y - 1, battleGround, start)

    return ans

}