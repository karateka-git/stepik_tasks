fun main(args : Array<String>) {
    task1()
    task2()
}

fun task1() {
    val minutes = readLine()?.toInt()?:return
    var hours: Int
    val days: Int

    hours = minutes / 60 + if (minutes%60 >= 30) 1 else 0
    days = hours / 24
    hours -= days*24
    print("days: $days\nhours: $hours")
}
