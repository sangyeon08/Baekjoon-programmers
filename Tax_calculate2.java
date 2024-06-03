import java.util.Scanner;
	public class Tax_calculate2{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
	
			System.out.print("근로소득을 입력하세요 : ");
			double salary = sc.nextDouble();
			double a = 0;

			if(salary>80000000)
				a = ( salary * 0.4 );
				
			else if( salary > 40000000 && salary <= 80000000 )
				a = ( salary * 0.25 );

			else if( salary > 20000000 && salary <= 40000000 )
				a = (salary*0.15);

			else
				a = (salary*0.05);
	
				System.out.println("근로소득세 : "+a+"원");			
	}
}