fun main(){

    val isHeCute = intArrayOf(0,0)
    repeat(readln().toInt()){

        val opinion = readln().toInt()
        if (opinion == 0) isHeCute[0]++
        else isHeCute[1]++

    }

    if (isHeCute[0] > isHeCute[1]) println("Junhee is not cute!")
    else println("Junhee is cute!")

}

