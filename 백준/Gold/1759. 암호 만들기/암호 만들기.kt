lateinit var alphabets: List<String>
lateinit var visited: BooleanArray
val pickedAlphabets = mutableListOf<String>()
val ansList = mutableListOf<String>()

fun main() {

    val (l, c) = readln().split(" ").map { it.toInt() }
    visited = BooleanArray(c, { false })

    alphabets = readln().split(" ").sorted()

    findCrypto(0, l, 0)
    ansList.sorted().forEach {
        println(it)
    }

}

fun findCrypto(cnt: Int, depth: Int, beginWith: Int) {
    if (cnt == depth) {
        // 가능성이 있는 암호가 되려면
        // 모음이 하나 이상, 자음이 두개이상이어야함.
        var vowelsCnt = 0
        var consonantsCnt = 0

        pickedAlphabets.forEachIndexed { index, it ->
            if (isVowels(it)) vowelsCnt++
            else consonantsCnt++
        }

        if (vowelsCnt >= 1 && consonantsCnt >= 2) ansList.add(pickedAlphabets.joinToString(""))

    }
    for (index in beginWith until visited.size) {
        pickedAlphabets.add(alphabets[index])
        findCrypto(cnt + 1, depth, index + 1)
        pickedAlphabets.removeAt(pickedAlphabets.lastIndex)
    }
}

fun isVowels(alphabet: String): Boolean {
    var isVowels = false
    when (alphabet) {
        "a", "e", "i", "o", "u" -> isVowels = true
    }
    return isVowels
}