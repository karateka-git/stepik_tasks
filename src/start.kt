fun main() {
    println(task1())
    println(listOf("5", "4", "3", "2", "1", "6", "7", "8", "9", "10"))
    println(task2(listOf("5", "4", "3", "2", "1", "6", "7", "8", "9", "10")).map{it})
}

fun task1(): String = "Hello, World"

fun task2(inputList: List<String>) : IntArray {
    for (i in inputList) {
        i.toInt()
    }
    val outputArray = inputList.map{it.toInt()}.toIntArray()
    for (i in outputArray.indices) {
        for (j in 1 until outputArray.size - i) {
            if (outputArray[j-1] > outputArray[j]) {
                val tmp = outputArray[j-1]
                outputArray[j-1] = outputArray[j]
                outputArray[j] = tmp
            }
        }
    }
    return outputArray
}