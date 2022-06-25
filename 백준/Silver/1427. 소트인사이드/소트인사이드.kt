fun main(){

    var string = readln().toMutableList()


    for (i in 0 until string.size){

        var max = string[i] - '0'
        var maxIndex = i

        for (j in i+1 until string.size){

            val curNUm = string[j] - '0'

            if (max < curNUm){
                max = curNUm
                maxIndex = j
            }
        }

        var temp = string[i]
        string[i] = max.digitToChar()
        string[maxIndex] = temp

    }
    println(string.joinToString(""))
}