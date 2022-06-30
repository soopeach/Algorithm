fun main() {
    for(a in 2 .. 100){
        for(b in 2 .. a){
            for (c in b .. a){
                for(d in c .. a){
                    if (a * a * a == b * b * b + c * c * c + d * d * d){
                        println("Cube = $a, Triple = ($b,$c,$d)")
                    }
                }
            }
        }
    }
}