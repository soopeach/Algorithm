fun main() {

    val n = readln().toInt()
    var clapCnt = 0

    for(no in 1 .. n){

        no.toString().forEach{
            if(it == '3' || it == '6' || it == '9') clapCnt++
        }
    }

    println(clapCnt)
}

