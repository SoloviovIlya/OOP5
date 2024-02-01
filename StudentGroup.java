import java.util.List;
import java.util.Iterator;
public class StudentGroup implements Iterable<Student>{
    private List<Student> studentList;
    public List<Student> getStudentList(){
        return studentList;
    }
    public void setStudentList(List<Student> studentList){
        this.studentList = studentList;
    }

    @Override
    public Iterator<Student> iterator(){
        return new StudentGroupIterator(this);
    }
}
