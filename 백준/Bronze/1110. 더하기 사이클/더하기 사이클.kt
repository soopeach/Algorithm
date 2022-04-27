fun main() {

    var input = readln().toInt()
    var tens = input / 10 
    var units = input % 10 
    var cnt = 1
    var num = tens + units 

    while (input != 0) {
        tens = units 
        units = num % 10 
        num = tens + units 

        if (input == (tens.toString() + units.toString()).toInt()) break
        cnt++
    }

    print(cnt)


}