class Solution {
    private val rankInfoByName = mutableMapOf<String, Int>()
    private val rankInfoByIndex = mutableMapOf<Int, String>()

    fun solution(players: Array<String>, callings: Array<String>): List<String> {

        players.forEachIndexed { index, name ->
            rankInfoByIndex[index] = name
            rankInfoByName[name] = index
        }

        callings.forEach { calledName ->

            val calledPlayerIndex = rankInfoByName[calledName]!!

            val aheadPlayerIndex = calledPlayerIndex - 1
            val aheadPlayerName =  rankInfoByIndex[aheadPlayerIndex]!!

            rankInfoByName[calledName] = aheadPlayerIndex
            rankInfoByIndex[aheadPlayerIndex] = calledName

            rankInfoByIndex[calledPlayerIndex] = aheadPlayerName
            rankInfoByName[aheadPlayerName] = calledPlayerIndex

        }


        return rankInfoByIndex.toSortedMap().map {
            it.value
        }
    }
}