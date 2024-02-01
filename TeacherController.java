import java.util.Scanner;
public class TeacherController {
    private TeacherService teacherService;
    private TeacherView teacherView;
    public TeacherController(TeacherService teacherService, TeacherView teacherView){
        this.teacherService = teacherService;
        this.teacherView = teacherView;
    }
    public void begin() {
        Scanner scanner = new Scanner(System.in);
        boolean working = true;
        while (working){
            System.out.println("Выберите действие:");
            System.out.println("1. Создать учителя");
            System.out.println("2. Редактировать учителя");
            System.out.println("3. Показать список учителей");
            System.out.println("4. Выйти");
            int choise = scanner.nextInt();
            switch (choise) {
                case 1:
                    System.out.println("Введите имя учителя:");
                    String FirstName = scanner.next();
                    System.out.println("Введите отчество учителя:");
                    String MiddleName = scanner.next();
                    System.out.println("Введите фамилию учителя:");
                    String LastName = scanner.next();
                    teacherService.createTeacher(FirstName, MiddleName, LastName);
                    break;
                case 2:
                    System.out.println("Введите ID учителя для редактирования:");
                    Long Id = scanner.nextLong();
                    System.out.println("Введите новое имя:");
                    String newFirstName = scanner.next();
                    System.out.println("Введите новое отчество:");
                    String newmiddleName = scanner.next();
                    System.out.println("Введите новую фамилию:");
                    String newLastName = scanner.next();
                    teacherService.editTeacher(Id, newFirstName, newmiddleName, newLastName);
                    break;
                case 3:
                    teacherView.viewListTeachers(teacherService.getListTeachers());
                    break;  
                case 4:
                    working = false;
                    break;
                default:
                    System.out.println("Неправильный выбор. Попробуйте ещё раз.");  
            }
        }
    }
}
