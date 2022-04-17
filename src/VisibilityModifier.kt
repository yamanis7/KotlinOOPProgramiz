open class Base() {
    private var b = 2 // visible inside the file containing the declaration
    protected open val c = 3 // not available for packages (used for subclasses)
    internal val d = 4 // visible inside the same module (a set of Kotlin files compiled together)

    fun private() {
        println(b)
    }
    fun public() { // Bisa dideklarasi di mana saja
        var a = 1
        println(a)
    }
    fun protected() {
        println(c)
    }
    fun internal() {
        println(d)
    }
}
fun main() {
    val base = Base()
    base.public()
    base.private()
    base.protected()
    base.internal()
}