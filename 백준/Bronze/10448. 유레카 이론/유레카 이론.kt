fun main(){

    val testCase = readln().toInt()

    repeat(testCase){

        val k = readln().toInt()

        var maxN = 0
        var ans = 0

        for(no in 1 .. k){
            if(tN(no) >= k){
                maxN = no
                break
            }
        }

        for(i in 1 .. maxN){
            for(j in 1 .. maxN){
                for(s in 1 .. maxN){
                    if(tN(i) + tN(j) + tN(s) == k) {
                        ans = 1
                    }
                }
            }
        }

        println(ans)
    }

}

fun tN(x: Int) = x * (x + 1) / 2



