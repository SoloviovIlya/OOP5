import java.util.List;
public class TeacherView {
    public void viewListTeachers(List<Teacher> teachers) {
        System.out.println("Список учителей: ");
        for (Teacher teacher: teachers){
            System.out.println("ID: " + teacher.getId() + ", Имя: " + teacher.getFirstName() + ", Отчество: " + teacher.getMiddleName() + ", Фамилия: " + teacher.getLastName());
        }

    }
}
