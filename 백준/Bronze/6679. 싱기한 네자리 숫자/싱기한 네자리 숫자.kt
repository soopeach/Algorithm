fun main() {

    for(no in 2992 .. 9999){

        val decimal = no.toString().toList()
            .map{if (it.isDigit()) it -'0' else toNum(it)}.sum()
        val duoDecimal = no.toString(12).toList()
            .map{if (it.isDigit()) it -'0' else toNum(it)}.sum()
        val hexaDecimal = no.toString(16).toList()
            .map{if (it.isDigit()) it -'0' else toNum(it)}.sum()

        if(decimal == duoDecimal && decimal == hexaDecimal) println(no)

    }
}

fun toNum(n:Char): Int{
    var num = 0
    when(n) {
        'a' -> num = 10
        'b' -> num = 11
        'c' -> num = 12
        'd' -> num = 13
        'e' -> num = 14
        'f' -> num = 15
    }

    return num
}