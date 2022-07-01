fun main() {

    val (a, b) = readln().split(" ")

    var answer = 100
    val lengthA = a.length
    val lengthB = b.length
    // 길이가 같을 때
    if (lengthA == lengthB) {
        answer = difCnt(a, b)
    }

    // 길이가 다를 때
    else {

        var toAddCnt = lengthB - lengthA

        for (index in 0..toAddCnt) {
            var newA = ""
            for (addFront in 0 until index) {
                newA += "*"
            }
            newA += a
            for (addBack in 0 until toAddCnt - index) {
                newA += "*"
            }
            val difCnt = difCnt(newA, b)
            if (difCnt < answer) answer = difCnt
        }

    }

    println(answer)

}

fun difCnt(a: String, b: String): Int {
    var difCnt = 0
    for (index in 0 until a.length) {
        if (a[index] != b[index]
            && a[index] != '*'
        ) difCnt++
    }
    return difCnt
}
