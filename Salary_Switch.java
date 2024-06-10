import java.util.Scanner;

	public class Salary_Switch {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			System.out.print("현 연봉을 입력하세요 : ");
			double currentSalary = sc.nextDouble();   		// 현연봉
			
			sc.nextLine();

			System.out.print("근무평가등급을 입력하세요 : ");
			String rating = sc.nextLine();					// 등급
				
			double raise = 0.0;						// 연봉 인상액

			double newSalary;						// 새 연봉

				
			switch( rating ) {
				case "우수" : 
					raise =  ( currentSalary * 0.06 ); 
					break;
				case "보통" : 
					raise = ( currentSalary * 0.04 ); 
					break;
				case "불량" : 
					raise = ( currentSalary * 0.02 ); 
					break;
				default :
					System.out.println("유효하지 않은 등급입니다.");
					return;
					
			}
			newSalary = currentSalary + raise; 
			System.out.println("연봉인상액 : " + (int)raise);
			System.out.println("새 연봉인상액 : " + (int)newSalary);
	}
}