import java.util.*;
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            int add = 0;
            
            for(int i = 0; i < T; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                add = a+b;
                System.out.println("Case #" + (i+1)+": " + a + " + " + b + " = " + add);
            }
        }
    }