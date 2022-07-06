fun main() {

    var lCnt = 0
    var oCnt = 0
    var vCnt = 0
    var eCnt = 0
    var maxProbability = 0
    var maxProbabilityTeam = ""

    var chartreuseName = readln()
    chartreuseName.forEach {
        when (it) {
            'L' -> lCnt++
            'O' -> oCnt++
            'V' -> vCnt++
            'E' -> eCnt++
        }
    }

    val teamCnt = readln().toInt()

    repeat(teamCnt) {

        var curLCnt = 0
        var curOCnt = 0
        var curVCnt = 0
        var curECnt = 0

        val teamName = readln()
        teamName.forEach {
            when (it) {
                'L' -> curLCnt++
                'O' -> curOCnt++
                'V' -> curVCnt++
                'E' -> curECnt++
            }
        }
        val curProbalility =
            calProbability((lCnt + curLCnt), (oCnt + curOCnt), (vCnt + curVCnt), (eCnt + curECnt))

        if (maxProbability < curProbalility) {
            maxProbability = curProbalility
            maxProbabilityTeam = teamName
        }

        if (maxProbability == curProbalility) {

            if (maxProbabilityTeam == "") maxProbabilityTeam = teamName

            maxProbabilityTeam = listOf(maxProbabilityTeam, teamName).sorted()[0]
        }

    }

    println(maxProbabilityTeam)
}

fun calProbability(lCnt: Int, oCnt: Int, vCnt: Int, eCnt: Int) =
    ((lCnt + oCnt) * (lCnt + vCnt) * (lCnt + eCnt) * (oCnt + vCnt) * (oCnt + eCnt) * (vCnt + eCnt)) % 100
