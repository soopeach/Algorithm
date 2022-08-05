fun main() {
    val text = readln()
    """[dD][2]""".toRegex().find(text)?.let { println("D2") } ?: println("unrated")
}

