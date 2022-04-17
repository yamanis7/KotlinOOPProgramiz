class Attack {
    companion object hit {
        fun hitEnemy() = println("Enemy Hits")
    }
}
fun main() {
    Attack.hitEnemy()
}