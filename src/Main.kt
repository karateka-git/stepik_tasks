import kotlin.math.pow

fun main(args : Array<String>) {
//    task1()
//    task2()
      task3()
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

fun task2() {
    val STANDART_KNOT = 1852
    val STANDART_KM = 1000
    val knot = readLine()?.toDouble()?.times(STANDART_KNOT)?:return
    val km = (knot / STANDART_KM)
    print("$knot / $STANDART_KM = $km")
}

fun task3() {
    val inputStr = readLine()?.toList()?: return
    println(inputStr.joinToString(" "))
}

fun task4(client: Client?, message: String?, mailer: Mailer) {
    if (message == null) {
        return
    }
    val personalInfo = client?.personalInfo?:return
    val email = personalInfo.email?:return
    mailer.sendMessage(email, message);

}

class Client (val personalInfo: PersonalInfo?)
class PersonalInfo (val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}

fun task5(expr: Expr): Int =
    when (expr) {
        is Num -> expr.value
        is Sum -> task5(expr.left) + task5(expr.right)
        else -> throw IllegalArgumentException("Unknown expression")
    }

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr