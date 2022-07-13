fun main() {

    val string = readln()
    var ans = string.length

    string.forEachIndexed { index, it ->
        if (index + 1 < string.length)
            when (it) {
                'c' -> {
                    if (string[index + 1] == '=' || string[index + 1] == '-') ans--
                }
                'd' -> {
                    if (index + 2 < string.length)
                        if (string[index + 1] == 'z' && string[index + 2] == '=') ans--
                    if (string[index + 1] == '-') ans--
                }
                'l' -> {
                    if (string[index + 1] == 'j') ans--
                }
                'n' -> {
                    if (string[index + 1] == 'j') ans--
                }
                's' -> {
                    if (string[index + 1] == '=') ans--
                }
                'z' -> {
                    if (string[index + 1] == '=') ans--
                }
            }
    }
    println(ans)
}



