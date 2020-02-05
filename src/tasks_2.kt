import java.math.RoundingMode
import kotlin.math.floor

fun main(args: Array<String>) {
    // task1()
    // task2("Anna Ben Alex Anna Peter Jack Ben".split(" "))
//    val resultTask4 = task4("Smith Jones Bambury Patel Brown Singh Williams Taylor Wilson Davies Evans Scott".split(" "))
//    for (el in resultTask4) {
//        print("${el[0]}\n")
//    }
    task5("абракадабраабракадабра", "абракадабра")
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