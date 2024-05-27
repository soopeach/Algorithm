import java.util.*

class Solution {
    
    private val opens = listOf('(', '[', '{')
    
    fun solution(s: String): Int {
        var answer = 0
    
        val target = s + s
        
        var start = 0
        repeat(s.length) {
            if (target.slice(start until start + s.length).isAlright()) answer++
            start++
        }
        
        return answer
    }
    
    private fun String.isAlright(): Boolean {
        
        val stack = Stack<Char>()
        
        this.forEachIndexed { index, ch ->
            
            if (ch in opens) {
                stack.add(ch)
            }
            else {
                
                if (stack.isEmpty()) return false
                
                when (stack.peek()) {
                    '(' -> {
                        if (ch == ')') stack.pop()
                        else return false
                    }
                    '[' -> {
                        if (ch == ']') stack.pop()
                        else return false
                    }
                    '{' -> {
                        if (ch == '}') stack.pop()
                        else return false
                    }
                }
            }
        }
        
        return if (stack.isEmpty()) true else false
        
    }
}