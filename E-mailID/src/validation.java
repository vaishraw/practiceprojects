
import java.util.Scanner;
public class validation {
	public static void main(String[] args) {
		String[] str={"xyz.123@org.com","abc.345@org.com","pqr.567@org.com","suv.789@org.com"};
		
		while(true) {
		System.out.println("Enter E-mail Id:");
		Scanner sc=new Scanner(System.in);
		String x=sc.next();
		/*for(int i=0;i<=3;i++) {
			//System.out.println(str[i]);
			if(str[i].equals(x)) {
				System.out.println(str[i]+": found");
				break;
			}
			else
			{
				System.out.println(x+" :not found");
				break;
			}
		}*/
		if(str[0].equals(x)) 
		{System.out.println(str[0]+": found");
		break;
		}
		else if(str[1].equals(x)) 
		{System.out.println(str[1]+": found");
		break;
		}
		else if(str[2].equals(x))
		{System.out.println(str[2]+": found");
		break;
		}
		else if(str[3].equals(x))
		{System.out.println(str[3]+": found");
		break;
		}
		else 
		{System.out.println("Invalid mail-id");}
		}
    }
}
