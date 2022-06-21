fun main() {

    val vowels = "aeiou"

    var command = ""

    while (true) {

        var vowelsCnt = 0

        command = readln()
        if (command == "#") return

        command.forEach {
            if (vowels.contains(it.lowercase())) {
                vowelsCnt++
            }
        }

        println(vowelsCnt)
    }

}