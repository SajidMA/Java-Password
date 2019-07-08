// Sajid Ahmed
// Generates a strong password derived from the users input
package password;

/**
 *
 * @author Sajid Ahmed
 */
import java.util.Scanner;
public class Password {

    
    public static void main(String[] args) {
        String firstName, lastName, favNumber, birthCity, randomNum;
        String mutation1, mutation2, mutation3, mutation4, mutation5;
        Scanner scan = new Scanner (System.in);
        System.out.print("Please enter your first name: ");
        firstName = scan.next();
        mutation1 = firstName.substring(0,1).toUpperCase().concat(firstName.substring(1,2).toLowerCase());
        System.out.println("Pwd so far: " + mutation1);
        System.out.print("Please enter your last name: ");
        lastName = scan.next();
        mutation2 = lastName.substring(0,1).toUpperCase().concat(lastName.substring(1,2).toLowerCase());
        System.out.println("Pwd so far: " + mutation1 + mutation2);
        System.out.print("Please enter your 2-digits favorite number: ");
        favNumber = scan.next();
        mutation3 = favNumber.substring(0,1).concat("^").concat(favNumber.substring(1,2));
        System.out.println("Pwd so far: " + mutation1 + mutation2 + mutation3);
        System.out.print("Please enter your City of Birth: ");
        birthCity = scan.next();
        mutation4 = birthCity.substring(0,1).toUpperCase().concat(birthCity.substring(1,2).toLowerCase());
        System.out.println("Pwd so far: " + mutation1 + mutation2 + mutation3 + mutation4);
        System.out.print("Your 2-digits random number: ");
        randomNum = scan.next();
        mutation5 = randomNum.substring(0,1).concat(".").concat(randomNum.substring(1,2));
        System.out.println("Your Final Pwd is: " + mutation1 + mutation2 + mutation3 + mutation4 + mutation5); 
    }
    
}
