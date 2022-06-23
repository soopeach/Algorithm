fun main(){

    val hamberger = mutableListOf<Int>()
    val drink = mutableListOf<Int>()

    while (hamberger.size < 3){
        hamberger.add(readln().toInt())
    }

    while (drink.size < 2){
        drink.add(readln().toInt())
    }

    println(hamberger.minOf { it } + drink.minOf { it } - 50)

}