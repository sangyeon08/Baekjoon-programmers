import java.util.Scanner;
	public class Dollar {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

				System.out.print("��ȭ�� �Է��ϼ���(���� : ��) : ");
				double money = sc.nextInt();
				double result = money / 1260;
				double answer = (int)(result * 100 + 0.5) / 100.0;

				System.out.println(money+"���� $"+answer+"�Դϴ�.");
		}
	}