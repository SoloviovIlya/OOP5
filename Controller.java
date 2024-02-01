import java.util.List;

public class Controller {
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private StreamService streamService;
    private GroupService groupService;
    public Controller(StreamService streamService){
        this.streamService = streamService;
    }
    public void removeStudentByFIO(String FirstName, String LastName, String MiddleName){
        studentGroupService.removeStudentByFIO(FirstName, LastName, MiddleName);
    }
    public List<Student> getSortedStudentList(){
        return studentGroupService.getSortedStudentList();
    }
    public List<Student> getSortedStudentByFIO(){
        return studentGroupService.getSortedStudentByFIO();
    }
    public void sortStreams(List<Stream> streams) {
        streamService.sortStreams(streams);
    }
    public Controller(GroupService groupService){
        this.groupService = groupService;
    }
    public Group createAndReturnGroup(Teacher teacher, List<Student> students) {
        return groupService.createGroup(teacher, students);
    }
}
