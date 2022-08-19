fun main() {

    while (true) {
        val string = readln().lowercase()
        if (string == "#") break

        val (target, sentence) = string.split(" ", limit = 2)
        var cnt = 0
        sentence.forEach {
            if (target == it.toString()) cnt++
        }
        println("$target $cnt")
    }

}



