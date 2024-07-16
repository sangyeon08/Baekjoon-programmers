import java.util.Scanner;
	public class Dollar {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

				System.out.print("원화를 입력하세요(단위 : 원) : ");
				double money = sc.nextInt();
				double result = money / 1260;
				double answer = (int)(result * 100 + 0.5) / 100.0;

				System.out.println(money+"원은 $"+answer+"입니다.");
		}
	}