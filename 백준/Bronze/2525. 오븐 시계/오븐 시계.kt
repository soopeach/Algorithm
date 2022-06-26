fun main(){

    var (hour, min) = readln().split(" ").map { it.toInt() }
    var minToNeed = readln().toInt()

    var afterMin = min + minToNeed

    while (afterMin >= 60){
        hour += 1
        afterMin -= 60
    }

    if (hour >= 24) hour -= 24

    println("$hour $afterMin")
}