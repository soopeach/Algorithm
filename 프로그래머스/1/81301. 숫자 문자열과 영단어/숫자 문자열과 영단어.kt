class Solution {
    fun solution(s: String): Int {
        var answer: String = ""
        
        var pointer = 0
        
        while(pointer < s.length) {
            
            when(s[pointer]) {
                'z' -> {
                    answer += "0"
                    pointer += 4
                }
                'o' -> {
                    answer += "1"
                    pointer += 3
                }
                't' -> {
                    
                    // 2
                    if (s[pointer + 1] == 'w') {
                        answer += "2"
                        pointer += 3
                        // 3
                    } else {
                        answer += "3"
                        pointer += 5
                    }
                }
                'f' -> {
                    // 4
                    if (s[pointer + 1] == 'o') {
                        answer += "4"
                        pointer += 4
                        // 5
                    } else {
                        answer += "5"
                        pointer += 4
                    }
                }
                's' -> {
                    // 6
                    if (s[pointer + 1] == 'i') {
                        answer += "6"
                        pointer += 3
                        // 7   
                    } else {
                        answer += "7"
                        pointer += 5
                    }
                }
                'e' -> {
                    answer += "8"
                    pointer += 5
                }
                'n' -> {
                    answer += "9"
                    pointer += 4
                }
                else -> {
                    answer += s[pointer]
                    pointer += 1
                }
                
            }
        }
        
        return answer.toInt()
    }
}