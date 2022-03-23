import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    Student fer;
    int grade1 = 100;
    int grade2 = 80;
    @Before
    public void init(){
        fer = new Student(1L, "fer");
    }
    @Test
    public void testCreateStudent(){
        Student ryan = null;
        assertNull(ryan);
        assertNotNull(fer);
    }

    @Test
    public void testStudentFields(){
        assertSame(1L, fer.getId());
        assertSame("fer", fer.getName());
        assertSame(0, fer.getGrades().size());
    }


    @Test
    public void testAddGrade(){
        fer.addGrade(grade1);
        assertSame(100, fer.getGrades().get(0));
        fer.addGrade(grade2);
        assertSame(80, fer.getGrades().get(1));
    }

    @Test
    public void testAverageGrade(){
        Student fer = new Student(1L, "fer");
        fer.addGrade(grade1);
        fer.addGrade(grade2);
        assertEquals(90, fer.getGradeAverage(), 0);
    }
}
