fun main(){
    val gradeMap = mapOf<String,Float>(
        "A" to 4.0f, "B" to 3.0f, "C" to 2.0f, "D" to 1.0f, "F" to 0.0f
    )

    val gradeAndSymbol = readln()
    val grade = gradeMap?.get(gradeAndSymbol[0].toString())
    val sign =
        if (gradeAndSymbol.length == 1) 0f else {
            if (gradeAndSymbol[1] == '+') 0.3f
            else if (gradeAndSymbol[1] == '-') -0.3f
            else 0f
        }

    println(grade?.let { it + sign } ?: grade)
}