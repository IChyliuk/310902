package lab_1

open class StringJournal {
    private var Name: String = ""
    private val presence: MutableList<Boolean> = mutableListOf()

    fun makePresence(Name: String, presence: Boolean) {
        this.Name = Name
        this.presence.add(presence)
    }


    fun addEntry(name: String, presence: Boolean) {
        this.Name = name
        if (presence) {
            makePresence(name, presence)
        } else {

            this.presence.add(false)
        }
    }

    fun getpr(): MutableList<Boolean> {
        return this.presence;
    }
}

class Journal {
    val notice = false
    val string: MutableList<StringJournal> = mutableListOf()

    fun notice(un: University) {
        for (i in un.getStudents()) {

            string.add(StringJournal().apply { addEntry(i.Name, i.get()) })
        }
    }

    fun getstudents(un: University) {
        print("Список студентов: \n")
        for (elem in un.getStudents()) {
            print("${elem.Name} \n")
        }
    }
}

