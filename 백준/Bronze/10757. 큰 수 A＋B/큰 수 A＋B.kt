fun main() {

    var ans = ""
    // 올림여부
    var isAdd = false
    var (a, b) = readln().split(" ")

    // 계산을 뒤에서부터 할것이라서
    a = a.reversed()
    b = b.reversed()

    // 무조건 a가 길게 만들것.
    if (b.length > a.length) {
        var temp = a
        a = b
        b = temp
    }

    a.forEachIndexed { index, it ->

        val aNum = it - '0'

        // b의 길이가 현재 탐색중인 index보다 클때만
        if (b.length > index) {
            val bNum = b[index] - '0'
            var curNum = aNum + bNum + if (isAdd) 1 else 0
            isAdd = false

            if (curNum > 9) {
                curNum %= 10
                isAdd = true
            }
            ans = curNum.toString() + ans
        } else {
            if (isAdd) {
                isAdd = false
                var curNum = aNum + 1
                if (curNum > 9) {
                    curNum %= 10
                    isAdd = true
                }
                ans = (curNum).toString() + ans

            } else {
                ans = it + ans
            }

        }

    }

    if (isAdd) ans = "1" + ans

    println(ans)
}

// BigInteger 사용
//fun main(){
//    val (a, b) = readln().split(" ").map { it.toBigInteger() }
//    println(a.add(b))
//}
