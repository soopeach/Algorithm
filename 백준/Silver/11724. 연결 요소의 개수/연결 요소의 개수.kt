var connectedComponent = 0
fun main() {

    val (n, m) = readln().split(" ").map { it.toInt() }
    val graph = Array(n + 1, { mutableListOf<Int>() })
    val visited = BooleanArray(n + 1, { false })
    val ans = 0
    
    repeat(m) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        graph[a].add(b)
        graph[b].add(a)
    }

    for (start in 1..n) {
        // 연결요소들을 묶어서 한개로 처리
        if (dfs(start, graph, visited)) connectedComponent++
    }
    println(connectedComponent)
}

fun dfs(start: Int, graph: Array<MutableList<Int>>, visited: BooleanArray): Boolean {

    // 이미 방문한 곳이라면 false 반환
    if (visited[start] == true) return false

    // 방문 처리
    visited[start] = true

    graph[start].forEach { current ->
        if (visited[current] == false) {
            dfs(current, graph, visited)
        }
    }
    return true
}