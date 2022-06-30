fun main() {

    val (a, b, c) = readln().split(" ").map{ it.toInt() }
    val frequencyOfSum = mutableMapOf<Int,Int>()

    for(i in 1 .. a){
        for(j in 1 .. b){
            for(k in 1 ..c){
                val sum = i + j + k
                frequencyOfSum.put(sum, frequencyOfSum.getOrDefault(sum,0)+1)
            }
        }
    }
    
    println(frequencyOfSum.toList().sortedByDescending{it.second}[0].first)

}