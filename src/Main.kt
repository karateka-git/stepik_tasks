fun main(args : Array<String>) {
    val a: Array<IntArray> = Array(2) {IntArray(4)}
    a[0] = intArrayOf(1, 2, 3, 4)
    a[1] = intArrayOf(5, 6, 7, 8)

    for (i in a) {
        for (j in i) {
            print(" $j")
        }
        println()
    }
    val goose = HydraGoose(a)
    goose.transpose()
    for (i in goose.innerMatrix) {
        for (j in i) {
            print(" $j")
        }
        println()
    }
}

