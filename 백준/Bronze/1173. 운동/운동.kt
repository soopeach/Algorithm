fun main() {

    val (target, min, max, increase, decrease) = readln().split(" ").map { it.toInt() }

    var pulse = min
    var time = 0
    var leftTime = target

    // 운동을 할 수 없는 경우
    if (min + increase > max) {
        println(-1)
        return
    }

    while (leftTime > 0) {

        //최대 맥박보다 운동을 한 후 맥박이 낮다면 운동할 수 있음.
        if (pulse + increase <= max) {
            time++
            pulse += increase
            leftTime--
        } else {
            pulse -= decrease
            if (pulse < min) pulse = min
            time++
        }

    }

    println(time)

}

