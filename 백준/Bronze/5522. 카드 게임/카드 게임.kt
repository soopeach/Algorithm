import java.math.BigInteger
fun main(){

    var score = BigInteger("0")
    repeat(5){
        score += readln().toBigInteger()
    }
    println(score)
}