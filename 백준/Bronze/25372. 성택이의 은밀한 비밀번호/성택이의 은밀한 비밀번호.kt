fun main() {
    repeat(readln().toInt()) {
        readln().apply {
            println(
                if (this.length in 6..9) "yes"
                else "no"
            )
        }
    }
}