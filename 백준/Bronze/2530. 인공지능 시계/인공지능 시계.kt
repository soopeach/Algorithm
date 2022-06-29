fun main() {

    var time = readln().split(" ").map{it.toInt()}.toIntArray()
    var afterSec = readln().toInt()
    formattedSec(afterSec).forEachIndexed{ index, it ->
        time[index] += it
    }

    var up = 0
    // 초 자릿수 올림
    if(time[2] >= 60){
        up = time[2] / 60
        time[2] %= 60
        time[1] += up
    }
    // 분 자릿수 올림
    if(time[1]>= 60){
        up = time[1] / 60
        time[1] %= 60
        time[0] += up
    }

    while(time[0] >= 24) time[0] -= 24

    time.forEach{ print("$it ") }
}

fun formattedSec(beforeSec: Int) : IntArray{
    var min = beforeSec / 60
    var sec = beforeSec % 60
    var hour = min / 60
    if(min >= 60) min %= 60

    return intArrayOf(hour,min,sec)

}





