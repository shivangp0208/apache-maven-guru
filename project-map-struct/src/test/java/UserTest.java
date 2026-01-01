import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.example.domain.User;

public class UserTest {

    User user = new User("Shivang", "Patel", "shivangp0208@gmail.com");

    @Test
    public void testGetFirstName() {
        assertEquals(user.getFirstName(), "Shivang");
    }

    @Test
    public void testGetLastName() {
        assertEquals(user.getLastName(), "Patel");
    }

    @Test
    public void testGetEmail() {
        assertEquals(user.getEmail(), "shivangp0208@gmail.com");
    }

}
