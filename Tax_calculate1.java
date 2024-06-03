import java.util.Scanner;
	public class Tax_calculate1{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
	
			double salary = sc.nextDouble();
			

			if(salary>80000000)
				System.out.println( salary * 0.4 );
			else if( salary > 40000000 && salary <= 80000000 )
				System.out.println( salary * 0.25 );
			else if( salary > 20000000 && salary <= 40000000 )
				System.out.println(salary*0.15);
			else
				System.out.println(salary*0.05);
	}
}