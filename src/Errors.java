public class Errors {

    public static void main(String[]args){
        try {
            String s = "WIT!";
            System.out.printf("%c%n", s.charAt(4));
        } catch (StringIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}