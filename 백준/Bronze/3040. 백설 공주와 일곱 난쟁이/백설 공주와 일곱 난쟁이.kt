fun main() {

    val dwarfList = mutableListOf<Int>()

    repeat(9){
        dwarfList.add(readln().toInt())
    }
    val totalNum = dwarfList.sum()
    for(fir in 0 until 9){
        for(sec in fir+1 until 9){
            if(totalNum - dwarfList[fir] - dwarfList[sec] == 100){
                dwarfList.forEach{
                    if(it != dwarfList[fir] && it != dwarfList[sec]) println(it)
                }
                return
            }
        }
    }
}


