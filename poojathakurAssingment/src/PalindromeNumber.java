import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner c =new Scanner (System.in);
				System.out.println("Etner a number");
				int no = c.nextInt();
				int  temp=no;
				int rev=0,rem;
				while(temp !=0)
				{
					rem=temp%10;
					rev=rev*10+temp;
							temp=temp/10;
					
				}
				if (no==rev) {
					System.out.println(no+"is palindrome number");
	}
	else
	{
				System.out.println(no+"is not a palindrome number");
	}

}
}