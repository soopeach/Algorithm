/**
 * 채팅방에 누군가 들어오면 다음 메시지가 출력됨
 * - [닉네임]이 들어왔습니다.
 *
 * 나가면 다음 메시지가 출력됨
 * - [닉네임]이 나갔습니다.
 *
 * 채팅방에서 닉네임을 변경하는 방법
 * - 채팅방을 나간 후, 새로운 닉네임으로 다시 들어감
 * - 채팅방에서 닉네임을 변경
 * 닉네임을 변경하면 채팅방에 출력된 닉네임도 전부 변경됨
 */
class Solution {
    val nickNameMap = mutableMapOf<String, String>()
    fun solution(record: Array<String>): Array<String> {

        var answer = arrayOf<String>()
        uidAndNameMatch(record)

        record.forEach{ string ->
            val commandList = string.split(" ")

            when(commandList.first()){
                "Enter" ->{
                    val uid = commandList[1]
                    answer += enter(uid)
                }
                "Leave" ->{
                    val uid = commandList[1]
                    answer += leave(uid)
                }

            }
        }



        return answer
    }

    fun uidAndNameMatch(record: Array<String>){
        record.forEach{ string ->
            val commandList = string.split(" ")

            when(commandList.first()){
                "Enter" ->{
                    val uid = commandList[1]
                    val nickName = commandList[2]
                    nickNameMap.put(uid, nickName)
                }
                "Change" ->{
                    val uid = commandList[1]
                    val nickName = commandList[2]
                    nickNameMap.put(uid, nickName)
                }
            }
        }
    }

    fun enter(uid: String) = "${nickNameMap.get(uid)}님이 들어왔습니다."
    fun leave(uid: String) = "${nickNameMap.get(uid)}님이 나갔습니다."

}