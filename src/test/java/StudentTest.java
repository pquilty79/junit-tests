
import org.junit.Test;
import student.Student;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void testIfInstanceIsNull() {
        ArrayList<Integer> gregsGrades = new ArrayList<>();
        Student greg = new Student(1, "greg", gregsGrades);
        assertNull(null);
        assertNotNull(greg);
    }



}