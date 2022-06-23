import kotlin.math.abs

// 굳이 굳이 dfs 사용
var minOfDiff = Int.MAX_VALUE
fun main() {

    val players = readln().split(" ").map { it.toInt() }
    dfs(0,0,players,0)
    println(minOfDiff)

}

fun dfs(cnt: Int, beginWith: Int, players: List<Int>, team: Int) {
    val depth = 2
    var team = team
    if (cnt == depth){
        val diffPower = abs(players.sum() - 2 * team)
        if (minOfDiff > diffPower) minOfDiff = diffPower
    }
    for(index in beginWith until 4){
        team += players[index]
        dfs(cnt+1,index+1, players, team)
        team -= players[index]
    }
}

// 쉽게 쉽게
// fun main() {
//
//    val players = readln().split(" ").map { it.toInt() }
//    val ans = abs(players.sum() - 2 * (players.minOf { it } + players.maxOf { it }))
//    println(ans)
//
//}
