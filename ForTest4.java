package MSG코테;

import java.util.Scanner;

public class ForTest4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("10 이하의 정수를 입력하세요 : ");
		int user = sc.nextInt();
		String a = "MSG";
		
		if(user>10) {
			System.out.println("해당 범위에 값이 들어있지 않습니다.");
		}else {
			for(int i = 0; i < user; i++) {
				System.out.println(a);
			}
		}
		sc.close();
	}
}