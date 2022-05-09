fun main(){

    val input = readln().toInt()

    for (i in input downTo 1){

        for (j in 0 until i){
            print("*")
        }
        println()
    }
}