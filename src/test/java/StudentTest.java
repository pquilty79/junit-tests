
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

    @Test
    public void testEmptyGradesListForNull(){
        ArrayList<Integer> gregsGrades = new ArrayList<>();
        assertNull(null);
        assertNotNull(gregsGrades);
    }


    @Test
    public void testGradeAverageIsEquals() {
        ArrayList<Integer> gregsGrades = new ArrayList<>();
        gregsGrades.add(98);
        gregsGrades.add(54);
        gregsGrades.add(87);
        double expected = 79.67;
        double actual = Student.getGradeAverage(gregsGrades);
        assertEquals(expected, actual, .01);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testUpdateGradeForException() {
        ArrayList<Integer> gregsGrades = new ArrayList<>();
        gregsGrades.add(98);
        Student.updateGrade(gregsGrades, 95, 2);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testDeleteGradeForException() {
        ArrayList<Integer> gregsGrades = new ArrayList<>();
        gregsGrades.add(98);
        Student.deleteGrade(gregsGrades, 2);
    }

    @Test
    public void testGetGradeForDouble() {
        ArrayList<Integer> gregsGrades = new ArrayList<>();
        gregsGrades.add(98);
        gregsGrades.add((int) 91.76);
        int expected = 91;
        int actual = gregsGrades.get(1);
        assertEquals(expected, actual);
    }




}