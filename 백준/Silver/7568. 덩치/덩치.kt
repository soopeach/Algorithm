// 몸무게, 키 / 한 쌍의 값을 담을 데이터 클래스
data class Size(var weight : Int, var height : Int)

fun main(){

    // 데이터 입력을 받을 횟수(cnt)
    var cnt = readlnOrNull()!!.toInt()
    // Size 데이터타입의 mutableList
    var sizeList = mutableListOf<Size>()

    // cnt 횟수만큼 반복해서 키, 몸무게 데이터를 입력받음.
    for(no in 1 .. cnt){
        var input = readlnOrNull()!!.split(" ")
        var size = Size(input[0].toInt(), input[1].toInt())
        sizeList.add(size)
    }

    // 각 데이터를 비교하여 순위를 매김.
    sizeList.forEach{
        cnt = 1
        sizeList.forEach { compared ->
            if (it.weight < compared.weight && it.height < compared.height){
                cnt++
            }
        }
        print("${cnt} ")
    }

}
