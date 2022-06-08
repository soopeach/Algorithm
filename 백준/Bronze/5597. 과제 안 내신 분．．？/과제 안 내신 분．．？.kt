fun main() {

    val array = BooleanArray(31, { false })

    repeat(28) {
        array[readln().toInt()] = true
    }

    array.forEachIndexed { index, it ->

        if (!it && index != 0) println(index)
    }
}