import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CohortTest {
    Cohort elixir;
    @Before
    public void inti() {
        elixir = new Cohort();
        Student student = new Student(1, "Ray");
        elixir.addStudent(student);
        student.addGrade(85);
        student.addGrade(90);
        Student student2 = new Student(2, "Wesley");
        elixir.addStudent(student2);
        student2.addGrade(50);
        student2.addGrade(70);
    }
    @Test
    public void testStudentAdd() {
        assertEquals(2, elixir.getStudents().size());
    }

    @Test
    public void testGetCurrentList() {
        assertNotNull(elixir.getStudents());
    }

    @Test
    public void testGetAverage() {
        assertEquals(73.75,elixir.getCohortAverage(),2);
    }

}
