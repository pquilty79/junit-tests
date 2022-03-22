
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
    public void testIfFieldsAreSet(){
        ArrayList<Integer> gregsGrades = new ArrayList<>();
        Student greg = new Student(2, "Greg", gregsGrades);
        assertEquals(2, greg.getId());
        assertEquals("Greg", greg.getName());
        ArrayList<Integer> annasGrades = new ArrayList<>();
        Student anna = new Student(4, "Anna", annasGrades);
        assertEquals(4, anna.getId());
        assertEquals("Anna", anna.getName());
    }

    @Test
    public void testIfAddGradeWorks(){
        ArrayList<Integer> gregsGrades = new ArrayList<>();
        Student greg = new Student(2, "Greg", gregsGrades);
        assertEquals(0, greg.getGrades().size());
        Student.addGrade(gregsGrades,90);
        assertEquals(1, greg.getGrades().size());
        Student.addGrade(gregsGrades,99);
        assertEquals(2, greg.getGrades().size());
    }

    @Test
    public void testIfGetGradesWorks(){
        ArrayList<Integer> gregsGrades = new ArrayList<>();
        Student greg = new Student(2, "Greg", gregsGrades);
        Student.addGrade(gregsGrades,90);
        Student.addGrade(gregsGrades,99);
        assertSame(90, greg.getGrades().get(0));
        assertSame(99, greg.getGrades().get(1));
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