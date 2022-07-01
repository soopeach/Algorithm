fun main() {

    val t = readln().toInt()

    repeat(t){

        val (a, b) = readln().split(" ").map{ it.toInt() }
        val gcd = gcd(a,b)
        val lcm = (a * b) / gcd

        println("$lcm $gcd")

    }
}

fun gcd(a: Int, b: Int): Int{

    if(b == 0) return a
    else return gcd(b, a%b)
}

