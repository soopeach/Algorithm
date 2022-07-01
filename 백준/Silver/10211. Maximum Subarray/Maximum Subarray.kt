fun main() {

    val t = readln().toInt()

    repeat(t){

        val size = readln().toInt()
        // 부분수열의 합들 중 최대
        var sumOfMaximumSubarray = -1000001
        // 수열
        val array = readln().split(" ").map{ it.toInt() }

        // 부분수열들을 완전 탐색
        for(start in 0 until size){
            for(end in start until size){
                val sumOfSubarray = array.subList(start,end+1).sum()
                if(sumOfMaximumSubarray < sumOfSubarray) sumOfMaximumSubarray = sumOfSubarray
            }
        }
        println(sumOfMaximumSubarray)
    }
}

