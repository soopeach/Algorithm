fun main() {

    val t = readln().toInt()

    repeat(t){

        val size = readln().toInt()
        var maximumSubarray = -1000001
        val array = readln().split(" ").map{ it.toInt() }

        for(start in 0 until size){
            for(end in start until size){
                val subarray = array.subList(start,end+1).sum()
                if(maximumSubarray < subarray) maximumSubarray = subarray
            }
        }

        println(maximumSubarray)
    }
}

