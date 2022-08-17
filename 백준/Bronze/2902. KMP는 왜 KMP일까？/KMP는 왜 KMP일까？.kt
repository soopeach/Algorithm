import java.lang.StringBuilder

fun main() {

    var ans = StringBuilder()
    readln().split("-")
        .forEach { ans.append(it[0]) }
        .apply { println(ans.toString()) }

}

