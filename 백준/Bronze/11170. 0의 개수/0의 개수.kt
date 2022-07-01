fun main() {

    val t = readln().toInt()

    repeat(t){

        val (n, m) = readln().split(" ").map{ it.toInt() }
        var zeroCnt = 0

        for(no in n .. m){

            no.toString().forEach{
                if(it == '0') zeroCnt++
            }
        }

        println(zeroCnt)
    }
}

