import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner s=new Scanner (System.in);
 System.out.println("Enter a number");
 int n=s.nextInt();
 Scanner a= new Scanner(System.in);
 System.out.println("Enter a number");
 int no = a.nextInt();
 int c;
 for(int i=1;i<=10;i++)
 {
	 c=no+n;
	 System.out.println(c);
	 no=n;
	 n=c;
 }
	}

}
