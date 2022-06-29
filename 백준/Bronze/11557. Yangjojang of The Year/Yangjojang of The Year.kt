fun main(){

    repeat(readln().toInt()){

        val drinkList = mutableMapOf<String, Int>()
        repeat(readln().toInt()){

            val schoolAndAmount = readln().split(" ")

            drinkList.put(schoolAndAmount[0],
                drinkList.getOrDefault(schoolAndAmount[0],0)+schoolAndAmount[1].toInt())

        }

        println(
            drinkList.toList().sortedByDescending { it.second }[0].first
        )

    }
}