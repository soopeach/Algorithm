fun main() {

    repeat(readln().toInt()) {

        var (a, b) = readln().split(" ").map { it.toInt() }

        // ^n(n승)을 계산하고 일의자리만 담을 변수. - 그렇지 않으면 오버플로우 발생함.
        var afterPowered = a % 10

        repeat(b - 1) {
            // ^n(n승)을 계산
            afterPowered *= a
            // 일의자리만 저장
            afterPowered %= 10

        }

        // 컴퓨터가 총 10대니까 일의자리수만큼 돌아감. - afterPowered가 0이라면 딱 맞아떨어지기 때문에 10번 컴퓨터가 동작
        if (afterPowered == 0 || afterPowered == 10) println(10) else println(afterPowered)

    }
}