fun main() {
    val item = itemName()
    item.name = "Crystal Maiden"
    println("${item.name}")
}
class itemName {
    var name: String = "defaultValue"
        get() = field
        set(value) {
            field = value
        }
}