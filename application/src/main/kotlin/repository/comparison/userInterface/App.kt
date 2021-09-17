package repository.comparison.userInterface

class App {
    fun execute() {
        Color.BLUE
    }
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

fun main() {
    println(App().execute())
}
