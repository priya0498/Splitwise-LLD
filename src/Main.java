import Model.User;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Controller controller = new Controller();
        System.out.println("Enter your name");
        String name = input.next();
        System.out.println("Enter your email");
        String email = input.next();
        System.out.println("Enter your mobile no");
        String num = input.next();
        User one = controller.createUser(name, email, num);
        System.out.println(one);


    }
}