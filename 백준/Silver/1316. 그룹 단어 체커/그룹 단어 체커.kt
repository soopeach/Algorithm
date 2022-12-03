fun main(){

    // 단어의 개수
    val n = readln().toInt()
    
    // 그룹 단어의 개수
    var groupWords = n
    
    // 단어의 개수만큼 반복
    repeat(n){

        val word = readln()
        val charSet = mutableSetOf<Char>()
        var lastChar = ' '
        var isGroupWord = true

        word.forEach {

            // 직전 단어와 다를 때
            if (lastChar != it) {
                lastChar = it
                if (!charSet.add(it)) isGroupWord = false
            }
        }
        // 그룹단어가 아니라면 그룹단어 개수에서 빼기
        if (!isGroupWord) groupWords--
    }
    println(groupWords)
}