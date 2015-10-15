import java.util.Scanner;

/**
 * Created by MattBrown on 10/15/15.
 */
public class Exercise {
    public static void main(String[] args) {


        System.out.println("Would you like to say Hello? [y/n]");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        while (!name.equals(("n"))) {
            if (name.equals("y")) {
                System.out.println("Hello!");
                System.exit(0);
            } else {

            }
        }
    }
}
