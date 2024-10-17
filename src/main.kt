fun main() {
    val student:student? = student()

    val unit = student?.let {st ->
        st.hi()
        st.bye()
        st.name="meow"
    }
    println(student?.name)
    val student2 = student?.apply{
        hi()
        bye()
        name="karl"
    }
    println(student?.name)
    println(student2?.name)
    val agestudent = student().run{
        hi()
        bye()
        name="oiu"
    }
    val agestudent2=with(student()){
        hi()
        bye()
        age=15
        age
    }
}