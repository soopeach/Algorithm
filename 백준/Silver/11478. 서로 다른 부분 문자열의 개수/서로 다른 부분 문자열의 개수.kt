fun main(){
    val s = readln()
    val substringList = mutableSetOf<String>()

    for (i in 0 .. s.length){

        for (j in i+1 .. s.length){
            val subsString = s.substring(i,j)
            substringList.add(subsString)
        }
    }
    println(substringList.size)
}