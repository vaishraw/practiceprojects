package calculator;
import java.util.Scanner;

public class CalculatorProgram {
	public static void main(String[] args) {
		double num1,num2;
		int ch;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Following Operations:");
			System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulus\n6.Exit");
		    System.out.println("enter which operation you want to perform: (1/2/3/4/5/6)");
		    ch=sc.nextInt();
	
			if (ch==1)
			{
				System.out.println("enter numbers:");
				num1=sc.nextInt();
				num2=sc.nextInt();
				
				double add=num1+num2;
				System.out.println("Addition: "+(add));}
				
			else if(ch==2)
			{
				System.out.println("enter numbers:");
				num1=sc.nextInt();
				num2=sc.nextInt();
				
				double sub=num1-num2;
				System.out.println("subtraction: "+(sub));}
			    
			else if(ch==3) {
				System.out.println("enter numbers:");
				num1=sc.nextInt();
				num2=sc.nextInt();
				
				double mul=num1*num2;
				System.out.println("multiplication: "+(mul));}
				
				else if(ch==4) {
					System.out.println("enter numbers:");
					num1=sc.nextInt();
					num2=sc.nextInt();
					
				double div=num1/num2;
				System.out.println("division: "+(div));}
				
				else if(ch==5) {
					System.out.println("enter numbers:");
					num1=sc.nextInt();
					num2=sc.nextInt();
					
				double mod=num1%num2;
				System.out.println("remainder: "+(mod));}
			
				else if(ch==6) {
				System.out.println("exit.");
				break;
				}
				
				else
				{System.out.println("invalid choice.");
			}
				
			
					
		}while(ch!=6);
		
	}

}
