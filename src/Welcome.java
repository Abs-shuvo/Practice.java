import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        System.out.print("Please Enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Welcome "+name+" to DeveloperHub");
    }
}
