import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by MattBrown on 10/15/15.
 */
public class Exercise {
    public static void main(String[] args) {


        System.out.println("Would you like to say Hello? [y/n]");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
            while (!answer.equalsIgnoreCase(("n")))
            if (answer.equals("y")) {
            System.out.println("TROLL!");
            System.exit(0);
            } else {

        }
    }
}
