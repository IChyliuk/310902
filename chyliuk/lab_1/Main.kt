package lab_1

fun main() {
    val un = University();
    val journal = Journal()
    val head = HeadStudent()
    val student = Students("test")

    while (true) {
        println("\nВыберите действие (введите номер):")
        println("1. Нанять преподавателя и составить ему план")
        println("2. Зачислить студента")
        println("3. Провести лекцию")
        println("4. Посетить лекцию")
        println("5. Отметить присутствующих")
        println("6. Отметить присутствующих снова")
        println("7. Получить список студентов")
        println("8. Сравнить списки")
        println("9. Доотметить отсутствие")
        println("10. Получить список лекций")
        println("0. Выйти")

        val choice = readlnOrNull()?.toIntOrNull()

        when (choice) {
            1 -> println("Вы выбрали: Нанять преподавателя и составить план лекций${un.addTeachers()}")
            2 -> println("Вы выбрали: Зачислить студента${un.addstudents()}")
            3 -> println("Вы выбрали: Провести лекцию${un.getTeachers().read(un)}")
            4 -> println("Вы выбрали посетить лекцию${pos(un)}")
            5 -> println("Вы выбрали: Отметить присутствующих${head.makenotice(un, journal)}")
            6 -> println("Вы выбрали: Отметить присутствующих снова${un.getTeachers().makenotice(un)}")
            7 -> println("Вы выбрали: Получить список студентов${journal.getstudents(un)}")
            8 -> println("Вы выбрали: Сравнить списки${un.getTeachers().compare(journal, un)}")
            9 -> println("Вы выбрали: Отметить отсутствие${head.makenotice(un, journal)}")
            10 -> println("Вы выбрали: Получить список лекций${student.getlectures(un)}")
            0 -> {
                println("Завершение программы")
                break
            }

            else -> println("Неверный ввод, попробуйте снова.")
        }
    }


}

fun pos(un: University){

    for (i in un.getStudents()) {
        i.presence()
    }
    un.lectures[0]
}


