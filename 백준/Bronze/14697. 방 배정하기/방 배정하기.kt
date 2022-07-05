fun main() {

    val (a, b, c, n) = readln().split(" ").map { it.toInt() }

    for (firRoom in 0..50) {
        
        val firRoomStudents = a * firRoom
        for (secRoom in 0..50) {
            val secRoomStudents = b * secRoom
            for (thirdRoom in 0..50) {
                val thirdRoomStudents = c * thirdRoom
                if (firRoomStudents + secRoomStudents + thirdRoomStudents == n) {
                    println(1)
                    return
                }
            }
        }
    }
    println(0)
}