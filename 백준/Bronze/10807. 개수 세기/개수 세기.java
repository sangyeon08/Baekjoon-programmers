import java.util.Scanner;
    public class Main{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int[] array = new int[amount];
        int sum = 0;
        
            for( int i = 0; i < amount; i++){
                array[i] = sc.nextInt();
            }
            int num = sc.nextInt();
            
            for( int i = 0; i < amount; i++){
                if(array[i] == num){
                    sum++;
                }
            }
            System.out.println(sum);
        }
    }