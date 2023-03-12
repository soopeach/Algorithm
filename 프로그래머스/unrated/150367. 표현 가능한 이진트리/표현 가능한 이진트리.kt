class Solution {
    
    fun solution(numbers: LongArray): IntArray {
        
        var answer: IntArray = intArrayOf()
        
        numbers.forEach { num ->
            
            val binaryNum = num.toBinary()
            val treeSize = getPerfectBinaryTreeSize(binaryNum)
            
            val insufficientNodeCnt = treeSize - binaryNum.length
            
            val perfectBinary = "0".repeat(insufficientNodeCnt) + binaryNum
            
            if (isValidTree(perfectBinary)) answer += CAN_MAKE
            else answer += CANT_MAKE
            
        }
        
        return answer
    }
    
    private fun isValidTree(tree: String): Boolean {
    
        val length = tree.length
        
        // 리프 노드 혹은 1, 0 으로만 구성되어있을 경우 서브 트리 가능
        if (length == 1 || '1' !in tree || '0' !in tree) return true
        
        val rootIndex = length / 2
        
        // 루트가 0 인데 자식이 존재할경우 서브트리 불가능
        // 위에서 이미 자식에 1이 섞인 것을 검증
        if(tree[rootIndex] == '0') return false
        
        return isValidTree(tree.substring(0, rootIndex)) && isValidTree(tree.substring(rootIndex + 1, length))
    
    }
    
    private fun getPerfectBinaryTreeSize(binary: String): Int {
        
        var perfectBinaryTreeSize = 0
        var exponent = 0
        while (perfectBinaryTreeSize < binary.length) {
            perfectBinaryTreeSize += 2.powerBy(exponent)
            exponent++
        }
        
        return perfectBinaryTreeSize
    }
    
    private fun Int.powerBy(exponent: Int): Int {

        var result = 1
        
        if (exponent == 0) return result
        
        repeat(exponent) {
            result *= this
        }
        
        return result
    }
     
    private fun Long.toBinary(): String {
        var target = this
        var binary = ""
        
        while(0 < target) {
            binary = (target % 2).toString() + binary
            target /= 2
        }
        
        return binary
        
    }
    
    companion object {
        private const val CAN_MAKE = 1
        private const val CANT_MAKE = 0
    }
}