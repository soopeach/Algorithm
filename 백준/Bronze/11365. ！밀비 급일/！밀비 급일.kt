fun main(){

    while (true){

        val s = readln()
        if (s == "END") return

        println(soopeachReverse(s))
    }
}

fun soopeachReverse(s: String) : String{
    var reversedS = ""

    s.forEach {
        reversedS = it + reversedS
    }

    return reversedS
}