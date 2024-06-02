class Solution {
    fun solution(my_string: String, overwrite_string: String, s: Int): String {
        var answer: String = ""
        
        repeat(s) {
            answer += my_string[it]
        }
        
        answer += overwrite_string
        
        while (answer.length < my_string.length) {
            answer += my_string[answer.length]
        }
        
        return answer
    }
}