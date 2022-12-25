val cardCnt = readln().toInt()
val selectCnt = readln().toInt()
val cardList = mutableListOf<Int>()
val isPicked = BooleanArray(cardCnt) { false }
val pickedNumList = mutableListOf<Int>()
val canMakeNumSet = mutableSetOf<String>()

fun main() {

    repeat(cardCnt) {
        cardList.add(readln().toInt())
    }

    findCanMakeNum(0, selectCnt)

    println(canMakeNumSet.size)
    
}

fun findCanMakeNum(count: Int, depth: Int) {
    if (count == depth) {
        canMakeNumSet.add(makeNum())
        return
    }
    for (index in 0 until cardCnt) {
        if (isPicked[index]) continue

        isPicked[index] = true
        pickedNumList.add(cardList[index])
        findCanMakeNum(count + 1, depth)
        isPicked[index] = false
        pickedNumList.removeLast()
    }
}

fun makeNum(): String = pickedNumList.fold("") { total, next ->
    total + next
}