fun main(){

    val dishes = readln()

    var lastDish = ' '
    var height = 0

    dishes.forEach {
        if (lastDish != it){
            height += 10
            lastDish = it
        } else{
            height += 5
        }
    }

    println(height)

}

