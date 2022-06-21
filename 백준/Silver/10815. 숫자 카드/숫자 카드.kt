fun main() {

    val n = readln().toInt()
    val cardSet = readln().split(" ").map { it.toInt() }.toMutableSet()
    val m = readln().toInt()

    // 상근이가 가지고 있는 카드번호인지 확인할 번호들을 입력받고 순차 탐색
    readln().split(" ").map { it.toInt() }.forEach {
        if (!cardSet.add(it)) print("1 ")
        else print("0 ")
    }
    
}