import java.util.Scanner;

public class Methods {

    private static Scanner in = new Scanner(System.in);

    private static double getDouble(){
        System.out.print("Enter a double: ");
        return in.nextDouble();
    }

    public static void main(String[] args){
        System.out.println("Result: " + getDouble());
    }
}
