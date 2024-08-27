package NewTest;

import java.util.Scanner;

public class n01_NumberCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		
		int a = sc.nextInt();

		if(a > 10) {
			System.out.println(a+"은(는) 10보다 큽니다.");
		}else if(a < 10){
			System.out.println(a+ "은(는) 10보다 작습니다.");
		}else {
			System.out.println(a+"은(는) 10과 같습니다.");
		}
		
		sc.close();
	}

}
