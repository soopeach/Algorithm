fun main(){

    repeat(readln().toInt()){
        println(
            readln().split(" ").map { it.toInt() }
                .sorted()[7]
        )
    }
}