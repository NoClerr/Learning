package Learning;

import java.util.Scanner;

public class Learning1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        for (int b = 0; b <= a; b++) {
            if (b % 3 == 0 && b % 5 == 0) {
                System.out.println("FizzBuzz");
            }
             else if (b % 3 == 0) {
                System.out.println("Fizz");
            }
             else if (b % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(b);
            }
        }
    }
}
