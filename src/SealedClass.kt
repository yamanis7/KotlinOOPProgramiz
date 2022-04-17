sealed class chooseRute {
    class ruteA : chooseRute()
    class ruteB : chooseRute()
}
fun main() {
    val choose1: chooseRute = chooseRute.ruteA()
    val pilihan = when (choose1) {
        is chooseRute.ruteA -> "Choose rute A"
        is chooseRute.ruteB -> "Choose rute B"
    }
    println(pilihan)
}