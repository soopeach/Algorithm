import java.math.BigInteger

fun main(){
    var num = mutableListOf<BigInteger>()

    num.add(BigInteger("0"))
    num.add(BigInteger("1"))

    var cnt = readln().toInt()
    for (no in 2..cnt){
        num.add(num[no-2] + num[no-1])
    }
    print(num[cnt])
}