fun main() {
    
    // 첫째 줄에 input을 입력 받음(N)
    var input = readln().toInt()
    // 십의 자리
    var tens = input / 10
    // 일의 자리
    var units = input % 10
    // 사이클 횟수
    var cnt = 1
    // 새로운 수
    var num = tens + units

    // input이 0이 아니라면 반복 - 입력값이 0 이라면 반복문을 실행하지 않고 cnt값인 1을 출력
    while (input != 0) {
        tens = units
        units = num % 10
        num = tens + units
        // 주어진 수가 새로운 수와 동일하다면
        if (input == (tens.toString() + units.toString()).toInt()) break
        cnt++
    }

    print(cnt)


}
