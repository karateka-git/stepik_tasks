fun main(args : Array<String>) {
    val duck = Duck()
    val goose = Goose()
    println("${duck.quack()} swim? ${duck.swim()}")
    println("${goose.gnaw()} swim? ${goose.swim()}")
}

