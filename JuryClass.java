package JavaTest;
import java.util.*;

class Rectangle{
	int width;
	int height ;
	int length = 0;
	int nulbi = 0;
	
	public int calculatePermeter() {
		length = (height + width)*2;
		System.out.print("둘레는  "+ length);
		return length;
	}
	public int calculateArea() {
		nulbi = height*width;
		System.out.println("넓이는" + nulbi);
		return nulbi;
	}
	public int getWidth() {
		System.out.println("가로의 길이는 : "+width);
		return width;
	}
	public int getHeight() {
		System.out.println("세로의 길이는 : " + height);
		return height;
		
	}
	public void setWidth(int a) {
			if(a< 0 && a > 20) {
				System.out.print("숫자를 다시 확인해주세요.");
			}
			else {
				width = a;
			}
		}
	
	public void setHeight(int b) {
		if(b< 0 &&  b> 20) {
			System.out.print("숫자를 다시 확인해주세요.");
		}
		else {
			height = b;
		}
	}
}

public class JuryClass {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle nemo = new Rectangle();
		int a = sc.nextInt();
		int b = sc.nextInt();
		nemo.setWidth(a);
		nemo.setHeight(b);
		nemo.calculatePermeter();
		nemo.calculateArea();
		nemo.getWidth();
		nemo.getHeight();
		
	}

}
