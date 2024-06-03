import java.util.Scanner;
	public class Tax_calculate3{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
	
			System.out.print("연간 근로소득을 입력하세요 : ");

			long salary = sc.nextLong();
			double tax = 0;

			if(salary>80000000)
				tax = ( salary * 0.4 );
				
			else if( salary > 40000000 && salary <= 80000000 )
				tax = ( salary * 0.25 );

			else if( salary > 20000000 && salary <= 40000000 )
				tax = ( salary * 0.15 );

			else
				tax = ( salary * 0.05 );
	
			System.out.println("근로소득세 : "+ tax +"원");			
	}
}