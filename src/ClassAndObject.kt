class skillUrsa {
    private var skill: Boolean = false
    fun isReady() {
        skill = true
    }
    fun isNotReady() {
        skill = false
    }
    fun statusSkill() {
        if(skill == true) {
            println("Skill is ready")
        } else {
            println("Skill is not ready")
        }
    }
}
fun main() {
    val s1 = skillUrsa()

    s1.isReady()
    s1.statusSkill()
}