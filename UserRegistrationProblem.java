import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserRegistrationProblem {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter first Name");
        String firstName = in.nextLine();
        UserRegistrationProblem userRegistrationProblem = new UserRegistrationProblem();
        userRegistrationProblem.firstName(firstName);
        System.out.println("Enter last Name");
        String lastName = in.nextLine();
        userRegistrationProblem.lastName(lastName);
        System.out.println("Enter the User Email");
        String gmail = in.nextLine();
        userRegistrationProblem.email(gmail);
        System.out.println("Enter Phone Number ");
        String phoneNO = in.nextLine();
        userRegistrationProblem.phoneNO(phoneNO);
        System.out.println("Enter Password");
        String password = in.nextLine();
        userRegistrationProblem.password(password);
    }

    public boolean firstName(String name){
        Pattern pattern1 = Pattern.compile("[A-Z]{1}[a-z]");
        Matcher matcher1 = pattern1.matcher(name);
        if (matcher1.matches()) {
            System.out.println("Valid First Name");
            return true;
        } else System.out.println("Not valid");
        return false;
    }
    public boolean lastName(String name){
        UserRegistrationProblem userRegistrationProblem = new UserRegistrationProblem();
        return userRegistrationProblem.firstName(name);
    }
    public boolean email(String email){
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            System.out.println("vaild");
            return true;
        } else System.out.println("not Valid");
        return false;
    }
    public boolean phoneNO(String phoneNO){
        Pattern pattern2 = Pattern.compile("^(?:(?:\\+|0{0,2})91(\\s*[\\ -]\\s*)?|[0]?)?[789]\\d{9}|(\\d[ -]?){10}\\d$");
        Matcher matcher3 = pattern2.matcher(phoneNO);
        if (matcher3.matches()) {
            System.out.println("valid phone number");
            return true;
        } else {
            System.out.println("Not a valid Phone number");
        }
        return false;
    }
    public boolean password(String password){
        Pattern pattern3 = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$");
        Matcher matcher4 = pattern3.matcher(password);
        if (matcher4.matches()) {
            System.out.println("valid password");
            return true;
        } else System.out.println("not valid password");
        return false;
    }
}
