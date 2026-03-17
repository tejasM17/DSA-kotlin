package dsa_concepts

open class Animal(val name: String){
    open fun sound() {
        println("Animal makes sound")
    }
}

interface  Runnable{
    fun run()
}

interface  Swimmable {
    fun swim()
}


class Dog(name: String) : Animal(name), Runnable, Swimmable {
    override fun sound() {
        println("$name Barks")
    }

    override fun run() {
        println("Dog can running")
    }

    override fun swim() {
        println("Dog is swimming")
    }
}

class Cat(name: String): Animal(name), Runnable {
    override fun sound() {
        println("$name meows")
    }

    override fun run() {
        println("$name is running")
    }
}


fun main() {
    val animals : List<Animal> = listOf(
        Dog("Rocky"),
        Cat("Nasha")
    )

    for (a in animals){
        a.sound()
    }

    val dog = Dog("Toommy")
    val cat = Cat("jerry")

    dog.run()
    dog.swim()
    dog.sound()

    cat.sound()
    cat.run()
}