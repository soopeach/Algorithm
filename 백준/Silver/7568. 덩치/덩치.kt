data class Size(var x : Int, var y : Int)

fun main(){

    var cnt = readlnOrNull()!!.toInt()
    var sizeList = mutableListOf<Size>()


    for(no in 1 .. cnt){
        var input = readlnOrNull()!!.split(" ")
        var size = Size(input[0].toInt(), input[1].toInt())
        sizeList.add(size)
    }

    sizeList.forEach{
        cnt = 1
        sizeList.forEach { compared ->
            if (it.x < compared.x && it.y < compared.y){
                cnt++
            }
        }
        print("${cnt} ")
    }

}