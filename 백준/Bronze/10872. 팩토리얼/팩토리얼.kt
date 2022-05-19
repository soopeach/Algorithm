fun main(){
    factorial(readln().toInt(),1)
}
fun factorial(n : Int, ans : Int){
    var no = ans
    if (n == 0) {
        println(no)
    } else {
        no *= n
        factorial(n - 1,no)
    }
}