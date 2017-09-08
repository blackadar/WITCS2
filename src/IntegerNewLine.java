import java.util.Scanner;

public class IntegerNewLine {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        int ints = in.nextInt();
        String strings = in.nextLine();

        System.out.println("Int: " + ints);
        System.out.println("String: " + strings);
    }
}
