package lab_1;
abstract class Lectures {
    
}
class Lecture constructor(Name: String)  {
    val Name = Name
    private val journal = Journal()

    fun getjournal(): Journal {
        return journal
    }
}