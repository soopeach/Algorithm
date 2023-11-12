class Solution {

    private data class Data(val item: String, val count: Int)

    fun solution(want: Array<String>, number: IntArray, discount: Array<String>): Int {

        var answer = 0

        for (i in 0 .. discount.size - 10) {

            val wishList = mutableMapOf<String, Int>()

            want.forEachIndexed { index, item ->
                wishList[item] = number[index]
            }

            repeat(10) {
                val index = i + it
                wishList[discount[index]]?.let { pre ->
                    wishList[discount[index]] = pre - 1
                }
            }

            if (wishList.values.all { it <= 0 }) answer += 1
        }

        return answer
    }
}