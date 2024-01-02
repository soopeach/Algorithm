class Solution {
    
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        
        val valueMap = mutableMapOf<String, Int>()
        
        var answer: IntArray = IntArray(photo.size)
        
        name.forEachIndexed { index, name ->
            valueMap[name] = yearning[index]
        }
        
        photo.forEachIndexed { index, rowList ->
            rowList.forEach { name ->
                answer[index] += valueMap.getOrDefault(name, 0)
            }
        }
        
        
        return answer
    }
}