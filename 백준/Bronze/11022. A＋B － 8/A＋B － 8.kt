fun main() {

    repeat(readln().toInt()){
        val (fir, sec) = readln().split(" ").map { it.toInt() }
        println("Case #${it+1}: $fir + $sec = ${fir+sec}")
    }

}