fun main() {

    var alphabetCnt = IntArray(26,{0})

    readln().forEach {
        alphabetCnt[it.code - 97]++
    }

    alphabetCnt.forEach {
        print("$it ")
    }
}