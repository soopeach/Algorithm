fun main(){

    val n = readln().toInt()

    repeat(n){

        val (doNotAd, doAd, payForAd) = readln().split(" ").map { it.toInt() }

        if (doNotAd + payForAd == doAd) println("does not matter")
        else if (doNotAd + payForAd < doAd) println("advertise")
        else println("do not advertise")
    }

}

