open class Operator(name: String, pengalaman: Int) {
    init {
        println("Operator Name : $name")
        println("Combat Experience : $pengalaman years")
    }
}
class Guard(name: String, pengalaman: Int): Operator(name, pengalaman) {
    fun Lord() {
        println("Type Guard branch Lord")
    }
    fun Dreadnought() {
        println("type Guard branch Dreadnought")
    }
}
class Sniper(name: String, pengalaman: Int): Operator(name, pengalaman) {
    fun Marksman() {
        println("Type Sniper branch Marksman")
    }
    fun Heavyshooter() {
        println("Type Sniper branch Heavyshooter")
    }
}
fun main() {
    val op1 = Guard("SilverAsh", 4)
    op1.Lord()
    println()

    val op2 = Guard("Skadi", 13)
    op2.Dreadnought()
    println()

    val op3 = Sniper("Exusiai", 2)
    op3.Marksman()
    println()

    val op4 = Sniper("Schwarz", 20)
    op4.Heavyshooter()
}