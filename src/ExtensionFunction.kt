fun String.hapusHurufPertama(): String =  this.substring(1, this.length)

fun main() {
    val myString= "Koding Kotlin"
    val result = myString.hapusHurufPertama()
    println("Huruf pertama yang dihapus: $result")
}