package test;

import main.Student;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
    Student student;
    Student student2;

    @Before
    public void setUp(){
        student = new Student(15, "Ray");
        student.addGrade(95);
        student2 = new Student(20, "Wesley");
        student2.addGrade(95);
        student2.addGrade(100);
        student2.addGrade(90);
    }

    @Test
    public void testConstructor() {
        assertNotNull( student.getName());
        assertEquals(1, student.getGrades().size());
        assertTrue(student.getName().length() > 0 );
    }

    @Test
    public void testSetName(){
        assertSame(95, student.getGrades().get(0));
    }

    @Test
    public void testGetAverage() {
        assertEquals(95, student2.getGradeAverage(), 2);
    }
}
