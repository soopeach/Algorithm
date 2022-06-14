import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (cntData, cntQuiz) = br.readLine().split(" ").map { it.toInt() }

    val pocketmonBookForName = mutableMapOf<String, Int>()
    val pocketmonBookForNum = mutableMapOf<Int, String>()

    repeat(cntData) { index ->
        val name = br.readLine()
        // 포켓몬의 이름이 키, 값은 포켓몬의 번호(순서이자 인덱스)
        pocketmonBookForName.put(name, index + 1)
        pocketmonBookForNum.put(index+1, name)
    }

    repeat(cntQuiz) {
        val input = br.readLine()

        // 입력으로 숫자가 들어왔다면
        if (input[0].isDigit()) {
            bw.write("${pocketmonBookForNum.get(input.toInt())}\n")
            // 입력으로 문자(포켓몬의 이름이 들어왔다면
        } else {
            bw.write("${pocketmonBookForName.get(input)}\n")
        }

    }

    bw.flush()
    bw.close()
}