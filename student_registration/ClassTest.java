package student_registration;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ClassTest {
    @Test
    public void test(){
        studentInformation student = new studentInformation();

        String result = student.setFirstName("sudeis");
        assertEquals("sudeis",result);

        String result2 = student.setLastName("fedlu");
        assertEquals("fedlu",result2);
    }


}
