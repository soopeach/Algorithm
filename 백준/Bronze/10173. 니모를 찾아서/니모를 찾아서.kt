import java.math.BigInteger
import java.util.StringJoiner

fun main() {

    val regex = """[nN][eE][mM][oO]""".toRegex()

    while (true) {

        val sentence = readln()
        if (sentence == "EOI") break

        regex.find(sentence)?.let { println("Found") } ?: println("Missing")

    }
}

