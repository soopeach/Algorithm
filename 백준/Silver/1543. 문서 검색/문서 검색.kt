fun main(){
    val s = readln()
    val regex = readln().toRegex()
    val ans = regex.findAll(s).toList().size
    println(ans)
}