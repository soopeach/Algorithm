fun main() {

    while (true) {
        val num = readln().split(" ")
        val firstNum = num[0].toInt()
        val secondNum = num[1].toInt()
        
        if (firstNum == 0 && secondNum == 0) break

        if (firstNum > secondNum) println("Yes")
        else println("No")

    }
}