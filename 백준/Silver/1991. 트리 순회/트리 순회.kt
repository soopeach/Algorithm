package hyunsoo.`17week`

/**
 *
 * <문제>
 * [이진 검색 트리](https://www.acmicpc.net/problem/5639)
 *
 * - 아이디어
 *
 * - 트러블 슈팅
 *
 */

data class Node<T>(
    var data: T? = null,
    var left: Node<T>? = null,
    var right: Node<T>? = null,
)

fun <T> findNode(node: Node<T>, targetData: String): Node<T> {

    if (node.data == targetData) {
        return node
    }

    node.left?.let { leftNode ->
        val leftNode = findNode(leftNode, targetData)
        if (leftNode.data == targetData) {
            return leftNode
        }
    }

    node.right?.let { rightNode ->
        val rightNode = findNode(rightNode, targetData)
        if (rightNode.data == targetData) {
            return rightNode
        }
    }

    return node
}

fun <T> preOrder(node: Node<T>) {

    print(node.data)
    node.left?.let { leftNode ->
        preOrder(leftNode)
    }
    node.right?.let { rightNode ->
        preOrder(rightNode)
    }
}

fun <T> inOrder(node: Node<T>) {

    node.left?.let { leftNode ->
        inOrder(leftNode)
    }
    print(node.data)
    node.right?.let { rightNode ->
        inOrder(rightNode)
    }
}

fun <T> postOrder(node: Node<T>) {

    node.left?.let { leftNode ->
        postOrder(leftNode)
    }
    node.right?.let { rightNode ->
        postOrder(rightNode)
    }
    print(node.data)
}

fun main() {

    val root: Node<String> = Node()
    val dataCnt = readln().toInt()

    val (rootData, rootLeftData, rootRightData) = readln().split(" ")

    root.data = rootData
    if (rootLeftData != ".") {
        root.left = Node(rootLeftData)
    }
    if (rootRightData != ".") {
        root.right = Node(rootRightData)
    }



    repeat(dataCnt - 1) {

        val (parent, leftData, rightData) = readln().split(" ")

        val targetNode = findNode(root, parent)

        if (leftData != ".") {
            targetNode.left = Node(leftData)
        }
        if (rightData != ".") {
            targetNode.right = Node(rightData)
        }
    }

    preOrder(root)
    println()
    inOrder(root)
    println()
    postOrder(root)
    println()

}