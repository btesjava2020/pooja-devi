import java.util.Scanner; 
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner (System.in);
System.out.println("enter no.");
int no=scanner.nextInt();
int temp=no;
int sum=0;
while(no>0) {
	int rem=no%10;
	sum=sum+(rem*rem*rem);
	no=no/10;
}
if(temp==sum) {
	System.out.println(temp+"is armstrong number");}
else {
	System.out.println(temp+"is not armstrong number");
}
	}

}
