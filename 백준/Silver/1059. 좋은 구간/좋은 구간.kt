fun main() {

    val L = readln().toInt()
    val s = readln().split(" ").map{ it.toInt() }.sorted().toIntArray()
    val n = readln().toInt()

    var goodCnt = 0
    for(a in 1 .. s[s.lastIndex]){

        if(n < a) break

        for(b in a + 1 .. s[s.lastIndex]){

            if (n > b) continue

            var isGood = true
            for(no in a .. b){
                if(s.contains(no)){
                    isGood = false
                    break
                }
            }
            if(isGood) goodCnt++
        }
    }

    println(goodCnt)

}

