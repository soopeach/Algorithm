fun main() {

    val n = readln().toInt()

    for(no in n .. Int.MAX_VALUE){
        // 펠린드롬이냐?
        if(isPalindrome(no)){
            // 소수냐?
            if(isPrime(no)) {
                print(no)
                return
            }
        }
    }

}

fun isPrime(n: Int): Boolean{

    // 1은 소수가아님.
    if(n == 1) return false
    // 2는 소수임.
    if(n == 2) return true

    for(div in 2 until n){
        if (n % div == 0) return false
    }

    return true
}

fun isPalindrome(no: Int): Boolean{
    val origin = no.toString()
    val reversed = origin.reversed()

    if(origin == reversed) return true
    return false
}







