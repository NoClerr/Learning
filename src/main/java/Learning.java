import java.util.Scanner;

public class Learning {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        for (int b = 1; b < a; b++) {
            if (b % 3 == 0 && b % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            if (b % 3 == 0) {
                System.out.println("Fizz");
            }
            if (b % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(b);
            }
        }
    }
}
