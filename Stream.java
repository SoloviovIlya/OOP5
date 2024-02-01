import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>{
    private List<StudentGroup> studentGroups = new ArrayList<>();

    @Override
    public Iterator<StudentGroup> iterator() {
        return studentGroups.iterator();
    }

    public List<StudentGroup> getStudentGroups() {
        return studentGroups;
    }

    public void setStudentGroups(List<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
    }
     
}
