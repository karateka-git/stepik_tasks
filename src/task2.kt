private interface Quackable {
    fun quack(): String
}

private interface Swimable {
    fun swim(): Boolean
}

private interface Gnawable {
    fun gnaw(): String
}

internal class Duck : Quackable, Swimable {
    override fun quack() = "Ква-ква"
    override fun swim() = true
}

internal class Goose : Gnawable, Swimable {
    override fun gnaw() = "Щип-щип"
    override fun swim() = true
}