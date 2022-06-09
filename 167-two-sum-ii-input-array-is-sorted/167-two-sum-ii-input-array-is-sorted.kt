class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var ans = intArrayOf(0,0)
        numbers.forEachIndexed{firIndex , it->
            for(secIndex in firIndex+1 until numbers.size){
                if (numbers[firIndex] + numbers[secIndex] == target){
                    println("${numbers[firIndex]} + ${numbers[secIndex]}")
                    ans[0] = firIndex + 1
                    ans[1] = secIndex + 1
                }
            }
        }
        return ans
    }
}