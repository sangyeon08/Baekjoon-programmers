import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int answer = 0;
            for(int i = 1; i<=9; i++){
                answer = a*i;
                System.out.println(a+" * "+i+" = "+answer); 
            }
        }
    }