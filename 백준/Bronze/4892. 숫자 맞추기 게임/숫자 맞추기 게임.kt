fun main() {

    var cnt = 1

    while (true){

        val num = readln().toInt()
        if (num == 0) break

        val firstStep = 3 * num
        var secondStep = 0

        if (firstStep % 2 != 0) secondStep = firstStep / 2
        else secondStep = (firstStep + 1) / 2

        val thirdStep = 3 * secondStep
        val fourthStep = thirdStep / 9

        var evenOrNull = ""
        if (firstStep % 2 == 0) evenOrNull = "even"
        else evenOrNull = "odd"

        println("${cnt++}. ${evenOrNull} ${fourthStep}")

    }

}

