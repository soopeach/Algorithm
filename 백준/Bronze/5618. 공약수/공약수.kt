fun main() {

    val n = readln().toInt()
    val targets = readln().split(" ").map{ it.toInt() }
    val minOfTargets = targets.minOf{it}
    for(divider in 1.. minOfTargets){

        var isCm = true
        for(index in 0 until targets.size){
            if(targets[index] % divider != 0) isCm = false
        }

        if(isCm) println(divider)
        
    }

}

