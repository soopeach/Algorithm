fun main() {

    val n = readln().toInt()

    var trophies = intArrayOf()

    repeat(n){
        trophies += readln().toInt()
    }

    var canSee = 1
    var maxHeight = trophies[0]

    // front
    for(index in 1 until n){
        if(trophies[index] > maxHeight) {
            maxHeight = trophies[index]
            canSee++
        }
    }
    println(canSee)

    val reversedTrophies = trophies.reversed()
    canSee = 1
    maxHeight = reversedTrophies[0]
    for(index in 1 until n){
        if(reversedTrophies[index] > maxHeight) {
            maxHeight = reversedTrophies[index]
            canSee++
        }
    }
    println(canSee)

}
