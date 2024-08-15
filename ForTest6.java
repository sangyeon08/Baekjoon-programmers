package MSG코테;

import java.util.Scanner;

public class ForTest6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수\t10개를\t입력하세요\t:\t");
			int count = 0;
			
			String user = sc.nextLine();
			String[] array = user.split(" "); 
					
				for(int i = 0; i < array.length; i++) {
					int num = Integer.parseInt(array[i]);
						if(num % 3 == 0 || num  % 5 == 0) {
							count ++;
					}
				}
			System.out.println("3과\t5의\t배수의\t개수\t:\t"+count);
			sc.close();
	}
}
