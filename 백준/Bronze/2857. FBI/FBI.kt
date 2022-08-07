fun main() {

    val regex = """FBI""".toRegex()
    var isExist = false
    repeat(5) { index ->
        val s = readln()
        regex.find(s)?.let {
            isExist = true
            print("${index + 1} ")
        }
    }

    if (!isExist) println("HE GOT AWAY!")
}
