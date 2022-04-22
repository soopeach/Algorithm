import java.io.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val neverHeard = HashMap<String, Boolean>()
    val neverSeen = HashMap<String, Boolean>()
    val neverHeardAndNeverSeen = mutableListOf<String>()

    val cnt = br.readLine()!!.split(" ")

    repeat(cnt[0].toInt() + cnt[1].toInt()) { index ->

        val person = br.readLine()!!

        // 듣도 못한 사람
        if (index < cnt[0].toInt()) {
            neverHeard.put(person, true)
        }
        // 보도 못한 사람
        else neverSeen.put(person, true)

    }

    // 보도 못한 사람이 더 많다면
    if (neverHeard.size < neverSeen.size) {

        neverSeen.forEach {
            if(neverHeard.get("${it.key}") == true) neverHeardAndNeverSeen.add("${it.key}")
        }
    } else {
        neverHeard.forEach {
            if(neverSeen.get("${it.key}") == true) neverHeardAndNeverSeen.add("${it.key}")
        }
    }

    bw.write("${neverHeardAndNeverSeen.size}\n")
    neverHeardAndNeverSeen.sort()
    neverHeardAndNeverSeen.forEach {
        bw.write("$it\n")
    }
    bw.flush()
    bw.close()
}