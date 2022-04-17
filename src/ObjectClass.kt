object tambah {
    private var a: Int = 0
    var b: Int = 5

    fun angka2(): Int {
        a = 10
        return a
    }
}
fun main() {
    val hasil: Int
    hasil = tambah.angka2()
    val x = tambah.b + hasil
    println("${tambah.b} + $hasil = " + x )
}