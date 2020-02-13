class HydraGoose (var innerMatrix: Array<IntArray>) {
    val declareOneself: String
        get() = """
        |░░░░░░░░░░░░░░░░░░░░
        |░░░░▄▀▀▀▄░░░░░░░░░░░
        |▄███▀░◐░▄▀▀▀▄░░░░░░
        |░░▄███▀░◐░░░░▌░░░░░
        |░░░▐░▄▀▀▀▄░░░▌░░░░░░
        |▄███▀░◐░░░▌░░▌░░░░
        |░░░░▌░░░░░▐▄▄▌░░░░░
        |░░░░▌░░░░▄▀▒▒▀▀▀▀▄
        |░░░▐░░░░▐▒▒▒▒▒▒▒▒▀▀▄
        |░░░▐░░░░▐▄▒▒▒▒▒▒▒▒▒▒▀▄
        |░░░░▀▄░░░░▀▄▒▒▒▒▒▒▒▒▒▒▀▄
        |░░░░░░▀▄▄▄▄▄█▄▄▄▄▄▄▄▄▄▄▄▀▄
        |░░░░░░░░░░░▌▌░▌▌░░░░░
        |░░░░░░░░░░░▌▌░▌▌░░░░░
        |░░░░░░░░░▄▄▌▌▄▌▌░░░░░"""
}

fun HydraGoose.quack() = "Ква-ква"

fun HydraGoose.squeak() = "Ква-ква"

fun HydraGoose.whistle() = "Ква-ква"

fun HydraGoose.transpose() {
    val trans: Array<IntArray> = Array(innerMatrix[0].size) {IntArray(innerMatrix.size)}
    for ((indexStr, i) in innerMatrix.withIndex()) {
        for ((indexRow, j) in i.withIndex()) {
            trans[indexRow][indexStr] = j
        }
    }
    innerMatrix = trans
}
