import java.io.*

fun main() {

    // 빠른 입출력
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    // 듣도 못한 사람
    val neverHeard = HashMap<String, Boolean>()
    // 보도 못한 사람
    val neverSeen = HashMap<String, Boolean>()
    // 듣보잡 = 듣도 보도 못한 사람
    val neverHeardAndSeen = mutableListOf<String>()

    // 듣도 못한 사람, 보도 못한 사람의 수를 공백으로 입력받음.
    val cnt = br.readLine()!!.split(" ")

    // 듣도 못한 사람 + 보도 못한 사람의 수만큼 반복하여 입력 받음
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

        // 보도 못한 사람의 원소(it)들을 확인하여
        // 듣도 못한 사람에 속해있는지 확인하고 속해있다면
        // 듣도 보도 못한 사람에 추가
        neverSeen.forEach {
            if(neverHeard.get("${it.key}") == true) neverHeardAndSeen.add("${it.key}")
        }
    } else {
        // 듣도 못한 사람이 더 많거나 같다면
        // 듣도 못한 사람의 원소(it)들을 확인하여
        // 보도 못한 사람에 속해있는지 확인하고 속해있다면
        // 듣도 보도 못한 사람에 추가
        neverHeard.forEach {
            if(neverSeen.get("${it.key}") == true) neverHeardAndSeen.add("${it.key}")
        }
    }

    // 듣도 보도 못한 사람의 수를 출력
    bw.write("${neverHeardAndSeen.size}\n")
    // 듣도 보도 못한 사람을 사전순으로 정렬 후 출력
    neverHeardAndSeen.sort()
    neverHeardAndSeen.forEach {
        bw.write("$it\n")
    }
    bw.flush()
    bw.close()
}
