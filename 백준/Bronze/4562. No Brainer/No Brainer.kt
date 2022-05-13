fun main() {
    
    repeat(readln().toInt()){
        val dataSet = readln().split(" ")
        val eatenBrains = dataSet[0].toInt()
        val requireBrains = dataSet[1].toInt()

        if (eatenBrains < requireBrains) println("no brains".uppercase())
        else println("mmm brains".uppercase())
    }

}

