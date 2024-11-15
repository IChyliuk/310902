package lab_1;

abstract class Student{

abstract fun get():Boolean
abstract fun getlectures(un: University)
}

class Students constructor(Name: String) : Student() {
    private var presences: Boolean = false;
    val Name = Name

    fun presence(){
        this.presences = kotlin.random.Random.nextBoolean()
    }

    override fun get(): Boolean{
        return this.presences
    }

    override fun getlectures(un: University) {
        println("Список лекций:\n")
        for(i in un.lectures){
            println(i.Name)
        }
    }
}

class HeadStudent : Student(){
    private val presences: Boolean = true;
    val Name = "Misha"
    private fun notice(un: University, journal: Journal){
        journal.notice(un);
    }

    fun makenotice(un: University, journal: Journal){
        this.notice(un, journal)
    }

    override fun get(): Boolean{
        return this.presences
    }

    override fun getlectures(un: University) {
        println("Список лекций:\n")
        for(i in un.lectures){
            println(i.Name)
        }
    }
}

