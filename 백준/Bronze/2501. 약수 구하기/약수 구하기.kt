fun main() {

    val (n, k) = readln().split(" ").map{ it.toInt() }
    var divisors = intArrayOf()

    for(divider in 1 .. n){

        if(n % divider == 0) divisors += divider
    }

    if(divisors.size < k) print(0)
    else print(divisors[k-1])

}