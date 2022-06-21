fun main() {

    val hongsId = readln()

    repeat(3) {

        if (it == 1) {
            print(":fan::$hongsId::fan:\n")
        } else {
            repeat(3) { print(":fan:") }
            println()
        }
        
    }

}

