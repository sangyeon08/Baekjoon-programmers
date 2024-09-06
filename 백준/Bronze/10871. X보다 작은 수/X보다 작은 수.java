import java.util.Scanner;
    public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            

            int a = sc.nextInt();
            int num = sc.nextInt();
            int[] Array = new int[a];
            
            for(int i = 0; i < a; i++){
                Array[i] = sc.nextInt();
            }
            for(int i = 0; i < a; i++){
                if(Array[i] < num){
                    System.out.print(Array[i] + " ");
                }
            }
        }
    }
    