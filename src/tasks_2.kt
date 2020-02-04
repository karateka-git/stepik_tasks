import java.math.RoundingMode
import kotlin.math.floor

fun main(args: Array<String>) {
    task1()
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