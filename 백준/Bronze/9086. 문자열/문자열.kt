fun main(){
    repeat(readln().toInt()){
        readln().apply {
            println("${this[0]}${this[this.length-1]}")
        }
    }
}