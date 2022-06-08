import kotlin.math.abs

fun main(){
    print(abs(readln().split(" ")
        .map { it.toLong() }
        .reduce{sum, element ->
            sum - element}))
}