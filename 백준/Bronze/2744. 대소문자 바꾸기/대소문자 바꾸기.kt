fun main(){
    println(
        readln()
        .map { if (it.isUpperCase()) it.lowercase()
        else it.uppercase() }.joinToString(""))
}