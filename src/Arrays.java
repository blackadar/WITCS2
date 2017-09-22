public class Arrays {
    private static double[] piArray = new double[100];
    private static double pi = 3.14;

    public static void main(String[] args){
        for(int i = 0; i < piArray.length; i++){
            piArray[i] = pi;
        }

        for(double d : piArray){
            System.out.println(d);
        }
    }
}
