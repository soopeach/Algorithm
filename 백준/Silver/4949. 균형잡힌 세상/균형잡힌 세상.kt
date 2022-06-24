import java.util.Stack

fun main() {


    val stack = Stack<Char>()
    while (true) {

        val string = readln()

        // "."가 입력되면 실행 종료
        if (string == ".") return

        string.forEach { curChar ->

            val lastStackElement = if (stack.isNotEmpty()) stack.peek() else null
            // 괄호일 경우만 고려
            if (curChar == '[' || curChar == ']' || curChar == '(' || curChar == ')') {

                if (lastStackElement == '(') {

                    if (curChar == ')') stack.pop()
                    else stack.add(curChar)

                } else if (lastStackElement == '[') {

                    if (curChar == ']') stack.pop()
                    else stack.add(curChar)

                } else stack.add(curChar)

            }
        }

        if (stack.isEmpty()) println("yes") else println("no")
        stack.clear()

    }

}