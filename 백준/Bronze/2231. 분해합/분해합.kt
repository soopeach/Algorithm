fun main() {

    val input = readln().toInt()
    for (no in 1..input) {
        var tempAns = no
        no.toString().forEach {
            tempAns += it - '0'
        }
        if (input == tempAns) {
            println(no)
            return
        }
    }
    println(0)

}
