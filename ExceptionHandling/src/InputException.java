import java.util.InputMismatchException;
import java.util.Scanner;
public class InputException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the input:");
		try {
		int result=input.nextInt();
		System.out.println("You have entered :"+result);
		
		}catch(InputMismatchException y) {
			System.out.println("Enter the integer value");
			
		}finally{
			System.out.println("Your program is finished");
		
		}
		
		

	}

}
