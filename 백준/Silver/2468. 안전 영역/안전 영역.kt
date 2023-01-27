fun main() {

    // 지역의 높이 정보의 크기
    val size = readln().toInt()
    // 지역의 높이 정보 - 2차원 리스트로
    val localHeight = mutableListOf<MutableList<Int>>()
    // 안전지역의 개수
    var safeZone = 1

    // 지역의 높이 정보를 입력 받음
    repeat(size) {
        val data = readln().split(" ").map { it.toInt() }.toMutableList()
        localHeight.add(data)
    }

    // 지역의 높이 정보들 중 최대 높이
    var maxHeight = localHeight.maxOf { it.maxOf { it } }
    // 지역의 높이 정보들 중 최소 높이
    var minHeight = localHeight.minOf { it.minOf { it } }

    // 안전한 영역의 최대 개수를 구하기
    for (standardHeight in minHeight..maxHeight) {
        var curAns = 0
        val clone = cloneGraph(localHeight)
        for (x in 0 until size) {
            for (y in 0 until size) {

                if (dfs(x, y, standardHeight, clone) == true) curAns++
            }
        }
        if (curAns > safeZone) safeZone = curAns
    }
    println(safeZone)
}

fun dfs(x: Int, y: Int, standardHeight: Int, graph: MutableList<MutableList<Int>>): Boolean {

    // 범위를 넘어가면 탈출
    if (x < 0 || x >= graph.size || y < 0 || y >= graph.size) return false

    // 기준 높이보다 작거나 같으면 탈출
    if (graph[x][y] <= standardHeight) return false

    graph[x][y] = standardHeight

    dfs(x + 1, y, standardHeight, graph)
    dfs(x, y + 1, standardHeight, graph)
    dfs(x - 1, y, standardHeight, graph)
    dfs(x, y - 1, standardHeight, graph)

    return true
}

fun cloneGraph(graph: MutableList<MutableList<Int>>): MutableList<MutableList<Int>> {
    var clonegraph = Array<IntArray>(graph.size, { IntArray(graph.size, { 0 }) })

    graph.forEachIndexed { i, width ->
        width.forEachIndexed { j, data ->
            clonegraph[i][j] = data
        }
    }
    return clonegraph.map { it.toMutableList() }.toMutableList()
}

