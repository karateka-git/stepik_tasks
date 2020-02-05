import java.math.RoundingMode
import kotlin.math.floor

fun main(args: Array<String>) {
    // task1()
    // task2("Anna Ben Alex Anna Peter Jack Ben".split(" "))
//    val resultTask4 = task4("Smith Jones Bambury Patel Brown Singh Williams Taylor Wilson Davies Evans Scott".split(" "))
//    for (el in resultTask4) {
//        print("${el[0]}\n")
//    }
//    task5("абракадабраабракадабра", "абракадабра")
    print(task6("Rail safety", "Fairy tales"))
}

fun task1() {
    val input = readLine()?.split(" ")?.map{it.toFloat()}?: return print("sorry")

    val output = input.average() to getMedian(input)
    print("$output.first $output.second")

}

fun getMedian(collection: Collection<Float>) :Float {
    val collectionSorted = collection.sorted()
    return if (collectionSorted.size % 2 == 0) {
        (collectionSorted[collectionSorted.size / 2 - 1] +
                collectionSorted[collectionSorted.size / 2]) / 2
    } else {
        collectionSorted[collectionSorted.size / 2]
    }
}

fun task2(inputList: List<String>) : List<String> {
    return inputList.distinct()
}

fun task4(inputList: List<String>) : MutableList<MutableList<String>> {
    val outputList: MutableList<MutableList<String>> = mutableListOf()
    val inputSortedList = inputList.sorted()
    var i = 0
    var j = 0
    while (i < inputSortedList.size) {
        val wordsTheSameFirstLetter = inputSortedList.drop(i).takeWhile{ it[0] == inputSortedList[i][0] }
        i += wordsTheSameFirstLetter.size
        outputList.add(mutableListOf(wordsTheSameFirstLetter.joinToString(" ", "", "")))
        if (wordsTheSameFirstLetter.isNotEmpty()) {
            j++
        }
    }
    return outputList
}

fun task5(text: String, substring: String) : MutableList<Int> {
    var i = 0
    var output = mutableListOf<Int>()
    while (i+substring.length <= text.length) {
        i += if (text.substring(i, i+substring.length) == substring) {
            output.add(i)
            substring.length
        } else {
            1
        }
    }
    print(output.joinToString (" ", "", ""))
    return output
}

fun task6(s1: String, s2: String) : Boolean {
    val s2Chars = s2.toLowerCase().replace(" ", "").toCharArray()
    val s1Chars = s1.toLowerCase().replace(" ", "").toCharArray()
    if (s1Chars.size != s2Chars.size) return false
    for (i in s1Chars) {
        if (!s2Chars.contains(i)) return false
    }
    return true
}