import java.util.ArrayList;
import java.util.List;

public class Cohort {

    private List<Student> students;

    public Cohort() {
        this.students = new ArrayList<>();
    }

    public double getCohortAverage() {
        double avg = 0;
        if (this.getStudents().size() != 0) {
            for (Student student : this.getStudents()) {
                avg += student.getGradeAverage();
            }
            return avg / this.getStudents().size();
        } else {
            return avg;
        }
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public long findStudentById(long id) {
        if (this.getStudents().size() != 0) {
            for (Student student : this.getStudents()) {
                if (student.getId() == id) {
                    return student.getId();
                }
            }
            return id;
        } else {
            return 0;
        }
    }
}