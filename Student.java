public class Student implements Comparable<Student> {
    private Long StudentId;
    private String FirstName;
    private String LastName;
    private String MiddleName;
    public Long getStudentId() {
        return StudentId;
    }
    public void setStudentId(Long studentId) {
        StudentId = studentId;
    }
    public String getFirstName() {
        return FirstName;
    }
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }
    public String getLastName() {
        return LastName;
    }
    public void setLastName(String lastName) {
        LastName = lastName;
    }
    public String getMiddleName() {
        return MiddleName;
    }
    public void setMiddleName(String middleName) {
        MiddleName = middleName;
    }
    
    @Override
    public int compareTo(Student o){
        return this.StudentId.compareTo(o.StudentId);
    }
}
