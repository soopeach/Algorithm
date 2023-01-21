package hyunsoo.`19week`

import java.util.LinkedList
import java.util.Queue

/**
 *
 * <문제>
 * [숨바꼭질](https://www.acmicpc.net/problem/1697)
 *
 * 수빈이의 위치가 x일 때 걷는다면 1초 후 x-1 혹은 x+1로 이동함.
 * 순간이동하면 2*x의 위치로 이동함.
 * - 아이디어
 *  bfs로 탐색하기?
 *
 * - 트러블 슈팅
 *
 */
class `전현수_숨바꼭질` {

    data class LocationAndTime(val location: Int, val time: Int)

    private val queue: Queue<LocationAndTime> = LinkedList()
    private val locationData = IntArray(100_001)

    fun solution() {

        val (myLocation, targetLocation) = readln().split(" ").map { it.toInt() }
        locationData[myLocation] = 0
        queue.add(LocationAndTime(myLocation, 0))

        while (queue.isNotEmpty()) {

            val (curLocation, curSec) = queue.poll()

            if (curLocation == targetLocation) break

            val firWay = curLocation - 1
            val secWay = curLocation + 1
            val thrWay = curLocation * 2

            if (firWay in 0..100_000) {
                // 방문하지 않은 곳이라면
                if (locationData[firWay] == 0) {
                    locationData[firWay] = curSec + 1
                    queue.add(
                        LocationAndTime(firWay, curSec + 1)
                    )
                }
            }
            if (secWay in 0..100_000) {
                // 방문하지 않은 곳이라면
                if (locationData[secWay] == 0) {
                    locationData[secWay] = curSec + 1
                    queue.add(
                        LocationAndTime(secWay, curSec + 1)
                    )
                }
            }
            if (thrWay in 0..100_000) {
                // 방문하지 않은 곳이라면
                if (locationData[thrWay] == 0) {
                    locationData[thrWay] = curSec + 1
                    queue.add(
                        LocationAndTime(thrWay, curSec + 1)
                    )
                }
            }
        }
        
        println(locationData[targetLocation])
    }
}

fun main() {
    전현수_숨바꼭질().solution()
}