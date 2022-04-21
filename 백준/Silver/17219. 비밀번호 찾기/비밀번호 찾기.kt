fun main(){

    var hashMap = HashMap<String, String>()

    val input = readlnOrNull()!!.split(" ")
    val dataCnt = input[0].toInt()
    val searchCnt = input[1].toInt()


    for (no in 1 .. dataCnt ){
        val input = readlnOrNull()!!.split(" ")
        val key = input[0]
        val value = input[1]
        hashMap.put(key, value)
    }
    
    for (no in 1 .. searchCnt){
        val inputToSearch = readlnOrNull()!!
        println(hashMap[inputToSearch])
    }

}