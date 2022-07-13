fun main() {

    val month = readln().toInt()
    val day = readln().toInt()

    if (month < 2) println("Before")
    else if (month == 2) {
        if (day < 18) {
            println("Before")
        } else if (day == 18) println("Special")
        else {
            println("After")
        }
    } else {
        println("After")
    }
}
