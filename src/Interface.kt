interface Interface {
    val pengalaman: Int
        get() = 2
}
class portofolio : Interface {

}
fun main() {
    val data = portofolio()
    println("Pengalaman koding : ${data.pengalaman}")
}