import java.util.Scanner;

public class Looping {
    private static Scanner in = new Scanner(System.in);
    private static int total;
    private static boolean keepLooping = true;

    public static void main(String[] args){
        do{
            System.out.print(": ");
            int current = in.nextInt();
            System.out.println();
            total += current;
            System.out.println(":! " + total);
            if(current <= 100 && current >= 1) keepLooping = false;
        } while(keepLooping);
    }
}