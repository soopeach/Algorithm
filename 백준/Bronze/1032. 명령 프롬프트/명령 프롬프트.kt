fun main() {

    val n = readln().toInt()
    val fileList = mutableListOf<String>()
    var answer = ""

    repeat(n) {
        val file = readln()
        fileList.add(file)
    }
    
    val length = fileList[0].length

    for (row in 0 until length) {

        var isSame = true
        var lastChar = fileList[0][row]

        for (col in 0 until fileList.size) {
            
            val curChar = fileList[col][row]
            
            if (lastChar != curChar) {
                isSame = false
                break
            }
        }
        
        if (isSame) answer += lastChar
        else answer += "?"
        
    }

    println(answer)
}

