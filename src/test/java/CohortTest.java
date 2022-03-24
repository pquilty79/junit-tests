import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CohortTest {

    Cohort emptyCohort;
    Cohort cohortOne;
    Cohort cohortTwo;

    @Before
    public void init(){

        emptyCohort = new Cohort();
        cohortOne = new Cohort();
        cohortTwo = new Cohort();

        Student john = new Student(1, "John");
        Student jane = new Student(2, "Jane");

        john.addGrade(100);
        john.addGrade(50);

        jane.addGrade(80);
        jane.addGrade(90);
        jane.addGrade(100);
        cohortOne.addStudent(jane);
        cohortTwo.addStudent(jane);
        cohortTwo.addStudent(john);

    }

    @Test
    public void testIfAddStudentWorks(){
        assertEquals(1, cohortOne.getStudents().size());
        assertEquals(2, cohortTwo.getStudents().size());
    }

    @Test
    public void testIfGetStudentsWork(){
        assertEquals(2, cohortTwo.getStudents().get(0).getId());
        assertEquals(1, cohortTwo.getStudents().get(1).getId());
    }

    @Test
    public void testIfCohortAvgWorks(){
        assertEquals(90, cohortOne.getCohortAverage(), 0.5);
        assertEquals(82.5, cohortTwo.getCohortAverage(), 0.5);
    }


}
