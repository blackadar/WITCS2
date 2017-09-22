import java.util.Scanner;

public class Exponents {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        int integ = in.nextInt();
        int x = 0;
        while (x <= 32) {
            System.out.println(integ + "^" + x + ": " + Math.pow(integ, x));
            x++;
        }
    }
}
