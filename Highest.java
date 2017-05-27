import java.util.Scanner;

public class Highest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//take 3 numbers from the user and show the highest one
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The first number:");
		a=sc.nextInt();
		System.out.println("Enter The Second number:");
		b=sc.nextInt();
		System.out.println("Enter The Third number:");
		c=sc.nextInt();
		
		if(a>b &&a>c)
			System.out.println("The First Number is the HIGHEST:" +a);
		else if(b>a && b>c)
			System.out.println("The Second Number is the HIGHEST:" +b);
		else if(c>a && c>b)
			System.out.println("The Third Number is the HIGHEST:" +c);
		sc.close();
	}
}
