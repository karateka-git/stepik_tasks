fun <T> Collection<T>.task1(): Set<Set<T>> {
    val a: MutableSet<Set<T>> = mutableSetOf(this.toSet())
    this.map{a.addAll(this.minus(it).toSet().task1())}
    return a.sortedWith(compareBy{it.size}).toSet()
}

fun <T> Collection<T>.task1_2(): Set<Set<T>> = this.asSequence()
.fold(setOf(emptySet())) {
        acc,
        v -> acc.union(acc.map {
            st -> st.union(setOf(v))
        }.toSet())
}

fun callTask1() {
    var myset = readLine()!!.split(' ').map { it.toInt() }.toSet().task1()
    println(myset.size)
    println(myset.joinToString("\n"){it.joinToString(" ")})
}

    fun main(args: Array<String>) {
        callTask1()
    }
