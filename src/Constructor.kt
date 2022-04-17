class Hero(val heroName: String, val heroType: String) {
}

fun main() {
    val hero1 = Hero("Faceless Void", "Agility")
    println("Hero Name = ${hero1.heroName}")
    println("Hero Type = ${hero1.heroType}")
}