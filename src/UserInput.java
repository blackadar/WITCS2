import java.util.Scanner;

public class UserInput {
    private static Scanner in = new Scanner(System.in);
    private static int total;

    public static void main(String[] args){
        for(int i = 0; i < 3; i++){
            System.out.print("Integer " + (i + 1) + ": ");
            total += in.nextInt();
            System.out.println();
        }
        System.out.printf("Average: %.2f" , (double)total/3);
    }
}
