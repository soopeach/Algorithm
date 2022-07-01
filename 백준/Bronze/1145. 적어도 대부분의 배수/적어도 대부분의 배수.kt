fun main() {

    val numList = readln().split(" ").map{ it.toInt() }

    for(target in 1 until 100000000){

        var dividedCnt = 0
        
        for(dividerIndex in  0 until numList.size){
            if(target % numList[dividerIndex] == 0) dividedCnt++
        }
        
        if(dividedCnt >= 3){
            println(target)
            break
        }
    }

}