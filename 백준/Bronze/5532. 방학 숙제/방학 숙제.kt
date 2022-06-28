fun main() {

    var vacation = readln().toInt()
    var needToSolveKorean = readln().toInt()
    var needToSolveMath= readln().toInt()
    var canSolveKorean = readln().toInt()
    var canSolveMath = readln().toInt()


    var solvedAllMath = 0
    var solvecAllKorean = 0

    if (needToSolveKorean % canSolveKorean > 0) solvecAllKorean = needToSolveKorean / canSolveKorean + 1
    else solvecAllKorean = needToSolveKorean / canSolveKorean

    if (needToSolveMath % canSolveMath > 0) solvedAllMath = needToSolveMath / canSolveMath + 1
    else solvedAllMath = needToSolveMath / canSolveMath

    if (solvedAllMath > solvecAllKorean) println(vacation - solvedAllMath)
    else println(vacation - solvecAllKorean)
}


