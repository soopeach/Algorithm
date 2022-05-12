fun main() {

    var nineDwarf = mutableListOf<Int>()

    repeat(9) {
        nineDwarf.add(readln().toInt())
    }

    var sum = nineDwarf.sum()
    for (fir in 0..8) {
        for (sec in fir + 1..8) {
            if (sum - (nineDwarf[fir] + nineDwarf[sec]) == 100) {
                nineDwarf.removeAt(sec)
                nineDwarf.removeAt(fir)
                nineDwarf.sorted().forEach {
                    println(it)
                }
                return
            }
        }
    }
}
