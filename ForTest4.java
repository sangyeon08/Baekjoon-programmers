package MSG코테;

import java.util.Scanner;

public class ForTest4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("10\t이하의\t정수를\t입력하세요\t:\t");
		int user = sc.nextInt();
		String a = "MSG";
		
		if(user>10) {
			System.out.println("해당\t범위에\t값이\t들어있지\t않습니다.");
		}else {
			for(int i = 0; i < user; i++) {
				System.out.println(a);
			}
		}
		sc.close();
	}
}
