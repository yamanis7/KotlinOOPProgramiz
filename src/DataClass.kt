data class Operators(val name: String, val role: String)

fun main() {
    val ops1 = Operators("Sage", "Sentinel")
    println("Name = ${ops1.name} , Role = ${ops1.role}")
    println()

    val ops2 = ops1.copy("Jett", "Duelist")
    println("Name = ${ops2.name} , Role = ${ops2.role}")
    println()

    val ops3 = ops1.copy("Brimstone", "Smoker")
    val (name, role) = ops3
    println("Name = $name, Role = $role")
}