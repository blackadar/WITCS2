public class MethodParameters {
    public static void main(String[] args){
        Integer x = new Integer(10);
        changeInteger(x);
        System.out.println(x);
    }
    private static void changeInteger(Integer a){
        a = a * 2;
    }
}
