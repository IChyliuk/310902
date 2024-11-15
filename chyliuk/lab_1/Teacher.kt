package lab_1;

import com.sun.jdi.IntegerType

class Teacher constructor(Name: String) {
    val Name = Name

    fun read(un: University) {
        println("Преподаватель ${Name} прочитал лекцию по ${un.lectures[0].Name}")
        un.lectures[0].getjournal();
    }


    private fun notice(un: University) {
        un.lectures[0].getjournal().notice(un);
    }

    fun makenotice(un: University){
        notice(un)
    }

    fun compare(journal: Journal, un: University) {
        if (un.lectures[0].getjournal().string.equals(journal.string)) {
            println("Список не совпадает")
        } else {
            println("Список совпадает")
        }

    }
}