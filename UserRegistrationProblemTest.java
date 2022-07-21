import org.testng.annotations.Test;

public class UserRegistrationProblemTest {
    @Test
    public void validEmailTest() {
        UserRegistrationProblem userRegistrationProblem = new UserRegistrationProblem();
        assert(userRegistrationProblem.email("abc@yahoo.com"));
        assert(userRegistrationProblem.email("abc-100@yahoo.com,"));
        assert(userRegistrationProblem.email("abc.100@yahoo.com"));
        assert(userRegistrationProblem.email("adc.111@abc.com"));
        assert(userRegistrationProblem.email("abc-1002abc.net"));
        assert(userRegistrationProblem.email("abc.100@abc.com.au"));
        assert(userRegistrationProblem.email("abc@1.com"));
        assert(userRegistrationProblem.email("abc@gmail.com.com"));
        assert(userRegistrationProblem.email("abc+100@gmail.com"));
    }
}
