val personalityMap = mutableMapOf<Char, Int>(
    'R' to 0,
    'C' to 0,
    'J' to 0,
    'T' to 0,
    'A' to 0,
    'F' to 0,
    'M' to 0,
    'N' to 0,
)

class Solution {
    fun solution(survey: Array<String>, choices: IntArray): String {
        var answer: String = ""

        survey.forEachIndexed { index, personalities ->
            val firPersonality = personalities[0]
            val secPersonality = personalities[1]

            when (choices[index]) {
                1 -> {
                    personalityMap.put(
                        firPersonality,
                        personalityMap.getValue(firPersonality) + 3
                    )
                }

                2 -> {
                    personalityMap.put(
                        firPersonality,
                        personalityMap.getValue(firPersonality) + 2
                    )

                }

                3 -> {
                    personalityMap.put(
                        firPersonality,
                        personalityMap.getValue(firPersonality) + 1
                    )

                }

                5 -> {
                    personalityMap.put(
                        secPersonality,
                        personalityMap.getValue(secPersonality) + 1
                    )
                }

                6 -> {
                    personalityMap.put(
                        secPersonality,
                        personalityMap.getValue(secPersonality) + 2
                    )
                }

                7 -> {
                    personalityMap.put(
                        secPersonality,
                        personalityMap.getValue(secPersonality) + 3
                    )
                }
            }
        }

        if (personalityMap.get('R')!! >= personalityMap.get('T')!!){
            answer += "R"
        } else answer += "T"

        if (personalityMap.get('C')!! >= personalityMap.get('F')!!){
            answer += "C"
        } else answer += "F"

        if (personalityMap.get('J')!! >= personalityMap.get('M')!!){
            answer += "J"
        } else answer += "M"

        if (personalityMap.get('A')!! >= personalityMap.get('N')!!){
            answer += "A"
        } else answer += "N"
        
        return answer
    }
}

fun main() {
    val testSurvey = arrayOf(
        "AN", "CF", "MJ", "RT", "NA"
    )
    val choices = intArrayOf(5, 3, 2, 7, 5)
    val test = Solution()
    test.solution(testSurvey, choices)
}