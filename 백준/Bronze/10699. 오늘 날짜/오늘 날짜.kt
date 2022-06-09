import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main(){
    println(LocalDateTime.now().minusSeconds(60 * 60 * 3).format(DateTimeFormatter.ISO_DATE))
}