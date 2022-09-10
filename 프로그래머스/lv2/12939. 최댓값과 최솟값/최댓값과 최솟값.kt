/*
    요구 사항
    - 공백으로 구분된 숫자들 문자열로 주어지는데 최댓값과 최솟값을 리턴해라.
    
    이슈
    - 범위는??
*/

class Solution {
    fun solution(s: String) = s.split(" ").map{it.toLong()}.let{"${it.minOf{it}} ${it.maxOf{it}}"}
}