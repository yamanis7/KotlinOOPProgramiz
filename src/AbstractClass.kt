abstract class Orang(nama: String) {
    init {
        println("Nama saya $nama")
    }
    fun displayNIM(nim: String) {
        println("NIM : $nim")
    }
    abstract fun Hobi(hobi: String)
}
class mahasiswa(nama: String): Orang(nama) {
    override fun Hobi(hobi: String) {
        println(hobi)
    }
}
fun main() {
    val n1 = mahasiswa("Yamani")
    n1.displayNIM("A11.2020.12927")
    n1.Hobi("Hobi saya rebahan")
}