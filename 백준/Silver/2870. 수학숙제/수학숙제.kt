import java.math.BigInteger

fun main() {

    val regex = """\d+""".toRegex()

    val cnt = readln().toInt()
    val numList = mutableListOf<BigInteger>()
    repeat(cnt) {
        val s = readln()
        regex.findAll(s)?.toList()!!.forEach {
            numList.add(makeNum(it.value).toBigInteger())
        }
    }
    numList.sorted().forEach {
        println(it)
    }
}

fun makeNum(s: String): String {
    var start = 0
    s.forEach {
        if (it == '0') start = 0
    }

    return s.substring(start, s.length)
}
