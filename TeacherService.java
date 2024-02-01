import java.util.ArrayList;
import java.util.List;
public class TeacherService {
    private List<Teacher> teachers = new ArrayList<>();
    private Long currentId = (long) 1;
    public void createTeacher(String FirstName, String MiddleName, String LastName) {
        Teacher teacher = new Teacher();
        teachers.add(teacher);
        currentId++;
    }
    public void editTeacher(Long Id, String newFirstName, String newMiddleName, String newLastName) {
        for (Teacher teacher:teachers) {
            if (teacher.getId()==Id) {
                teacher.setFirstName(newFirstName);
                teacher.setMiddleName(newMiddleName);
                teacher.setLastName(newLastName);
                break;
            }
        }
    }
    public List<Teacher> getListTeachers(){
        return teachers;
    }
}
