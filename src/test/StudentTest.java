package test;

import main.Student;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
    Student student;
    @Before
    public void setUp(){
        student = new Student(15, "Ray");
    }

    @Test
    public void testConstructor() {
        assertNotNull( student.getName());
        assertEquals(0, student.getGrades().size());
        assertTrue(student.getName().length() > 0 );
    }


}
