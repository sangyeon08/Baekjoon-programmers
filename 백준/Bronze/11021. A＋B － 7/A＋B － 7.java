import java.util.*;
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int limit = sc.nextInt();
            int add = 0;
                
            for(int i = 0; i < limit; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                add = a+b;
                System.out.println("Case #" +(i+1)+": "+add);
            }
        }
    }