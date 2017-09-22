import java.util.Scanner;

public class ArrayInputs {
    private static int[] ints = new int[6];

    private static void collectData(){
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < 6; i++){
            System.out.print("Enter int " + i + ": ");
            ints[i] = in.nextInt();
        }
        in.close();
    }

    private static void addOne(){
        for(int i = 0; i < 6; i++){
            ints[i] = ints[i] + 1;
        }
    }

    private static void printArray(){
        for(int i : ints){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args){
        collectData();
        addOne();
        printArray();
    }
}
