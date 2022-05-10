fun main() {

    // 대소문자 구별을 하지않으므로 대문자로 변환 후 생각.
    val string = readln().uppercase()
    // 알파벳의 빈도수를 담을 배열 [0]은 A의 빈도수, [1]은 B의 빈도수...
    val cntArray = IntArray(26, { 0 })
    var alphabet = 'A'

    // 2중 반복문을 돌고나면 알파벳의 빈도수가 cntArray에 저장됨.
    for (i in 0 until 26) {
        for (j in 0 until string.length) {
            if (string[j] == alphabet) cntArray[i]++
        }
        alphabet++
    }

    // 최대 빈도수
    var max = 0
    // 최대 빈도수가 있는 인덱스
    var maxIndex = 0
    cntArray.forEachIndexed { index, it ->
        if (max < it) {
            max = it
            maxIndex = index
        }

    }
    
    // 최대 빈도수가 중복되면. "?" 출력하도록 만들기 위해서
    // cnt[maxIndex](빈도수가 최대인 부분) 부분을 0으로 초기화
    // 빈도수가 최대인 부분을 0으로 만들었는데 최대 빈도수(max)가 
    // cntArray에 존재한다면 최대 빈도수가 중복된다는 뜻이므로 "?" 출력
    cntArray[maxIndex] = 0
    if (max in cntArray) print("?")
    else print(getUppercase(maxIndex))

}

fun getUppercase(n: Int): Char {
    // 아스키 코드에서 대문자는 A == 65, B == 66 ...
    return (n + 65).toChar()
}
