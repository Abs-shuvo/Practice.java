import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to DeveloperHub Calculator!!");
        System.out.print("Please enter first number: ");
        int firstNumber= input.nextInt();
        System.out.print("Now,Please enter second number: ");
        int secondNumber= input.nextInt();
        int sum = firstNumber + secondNumber;
        System.out.println("Sum of your numbers is: " + sum);
    }
}
