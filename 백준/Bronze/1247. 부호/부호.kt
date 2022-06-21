import java.math.BigInteger

fun main() {

    repeat(3) {

        val inputCnt = readln().toInt()
        var s = BigInteger("0")
        repeat(inputCnt) {
            s += readln().toBigInteger()
        }

        if (s == BigInteger("0")) println("0") else if (s > BigInteger("0")) println("+") else if (s < BigInteger("0")) println("-")
    }
}