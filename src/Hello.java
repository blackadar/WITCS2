public class Hello {
    public static void main(String[] args){
        Runnable sayHello = () -> System.out.println("Welcome to CS2!");
        for(int i = 0; i <1; i++){
            switch(i){
                case 0:
                    new Thread(sayHello).start();
                    break;
            }
        }
    }
}