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

fun <T> Collection<T>.task2(k: Int): Set<Set<T>> {
    val a: MutableSet<Set<T>> = mutableSetOf(this.toSet())
    this.map { a.addAll(this.minus(it).toSet().task2(k)) }
    return a.filter { it.size == k }.toSet().sortedWith(compareBy { it.size }).toSet()
}

fun <T> Collection<T>.task2_1(k: Int): Set<Set<T>>  = this.asSequence()
        .fold(setOf<Set<T>>(emptySet())) { acc,
                                          v ->
            acc.union(acc.map { st ->
                st.union(setOf(v))
            }.toSet())
        }.filter { it.size == k }.toSet()


fun callTask2() {
    val inputSet = readLine()!!.split(' ').map { it.toInt() }.toSet()
    val k = readLine()!!.toInt()
    val myset = inputSet.task2(k)
    println(myset.size)
    println(myset.joinToString("\n"){ it.joinToString(" ") })
}

fun sums(n1:Int, n: Int): Set<List<Int>> = List(n) {i-> i+1}.fold(setOf(emptyList())){
        acc, v->
    acc.union(sums(n1, n-v).map{it-> it.plusElement(v).sorted()}).filter {
        it.sum() == n && !it.contains(n1)}.toSet()
}

fun callTask3() {
    val n = readLine()!!.toInt()
    val answer = sums(n,n)
    println(answer.size)
    println(answer.joinToString("\n"){it.joinToString(" + ")})
}

//fun sequences(k: Int, n: Int, m: Int): Set<List<Int>> = IntRange(1, k).fold(setOf(emptyList())) {
//    acc, v -> acc.union(sequences(k-1, n, m).map{listOf(v).plus(it)})
//}

fun sequences(k: Int, n: Int, m: Int): Set<List<Any>> = IntRange(1, k).fold(setOf(emptyList())) {
    acc, it1 ->
        println(it1)
        IntRange(1, k).map{
            it2 ->

                acc.union(IntRange(1, k).map {
                listOf(it2, it1, it)
            })
    }.get(1)
}


    fun main(args: Array<String>) {
//        callTask1()
//        callTask2()
//        callTask3()
        val k = readLine()!!.toInt()
        val n = readLine()!!.toInt()
        val m = readLine()!!.toInt()
        var answer = sequences(k, n, m)
        println(answer.size)
        println(answer.joinToString("\n"){it.joinToString(" ")})
    }
