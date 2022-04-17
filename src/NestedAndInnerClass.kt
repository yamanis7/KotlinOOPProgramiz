class Outer {
    val a = "Class Outer"

    class Nested {
        val b = "class Nested di dalam class Outer"
    }
    inner class Inner {
        val c = "class Inner di dalam class Outer"
    }
}

fun main() {
    val luar = Outer()
    println(luar.a)
    println(Outer.Nested().b)
    val inner = Outer().Inner()
    println(inner.c)


}