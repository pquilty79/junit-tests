import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CohortTest {

    Cohort emptyCohort;
    Cohort elixirCohort;


    @Before
    public void setUp(){

        emptyCohort = new Cohort();
        elixirCohort = new Cohort();

        Student john = new Student(1, "John");
        Student jane = new Student(2, "Jane");

        john.addGrade(100);
        john.addGrade(50);
        jane.addGrade(80);
        jane.addGrade(90);
        jane.addGrade(100);
        elixirCohort.addStudent(jane);
        elixirCohort.addStudent(john);

    }

    @Test
    public void testIfAddStudentWorks(){
        assertEquals(0, emptyCohort.getStudents().size());
        assertEquals(2, elixirCohort.getStudents().size());
    }

    @Test
    public void testIfGetStudentsWork(){
        assertEquals(2, elixirCohort.getStudents().get(0).getId());
        assertEquals(1, elixirCohort.getStudents().get(1).getId());
    }

    @Test
    public void testIfCohortAvgWorks(){

        assertEquals(82.5, elixirCohort.getCohortAverage(), 0.5);
    }

    @Test
    public void testIfFindStudentByIdWorks(){
        assertEquals(2, elixirCohort.findStudentById(2));
        assertEquals(0, emptyCohort.findStudentById(2));
    }


}
