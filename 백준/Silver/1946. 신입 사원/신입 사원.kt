fun main(){

    // 테스트 케이스만큼 반복
    val t = readln().toInt()
    repeat(t){
        // 서류심사 순위, 면접 순위순으로 저장.
        val gradeList = mutableListOf<Pair<Int,Int>>()
        // 지원자의 수
        val n = readln().toInt()
        // 뽑을 수 있는 최대 지원자의 수
        var ans = 0
        // 현재까지 뽑힌 지원자의 최대 면접 순위
        var maxRank = Int.MAX_VALUE

        // 지원자의 성적순위를 저장
        repeat(n){
            val scoreData = readln().split(" ").map { it.toInt() }
            gradeList.add(Pair(scoreData[0],scoreData[1]))
        }

        // 지원자의 서류심사 순위로 오름차순 정렬
        gradeList.sortBy{it.first}

        gradeList.forEachIndexed { index, curApplicant ->

            // 지원자들의 서류심사 순위로 이미 정렬이 되었기 때문에 
            // 현재 뽑힌 지원자들의 면접 순위의 가장 낮은 등수 보다 작다면 뽑힐 수 있다는 뜻
            if (maxRank > curApplicant.second){
                maxRank = curApplicant.second
                ans++
            }

        }

        println(ans)
        gradeList.clear()
    }
}