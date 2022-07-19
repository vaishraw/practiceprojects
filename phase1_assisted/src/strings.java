
public class strings {
	public static void main(String[] args) {
		System.out.println("METHODS OF STRINGS");
		String s1=new String("Hello World");
		System.out.println(s1.length());
		
		String sub=new String("Welcome");
		System.out.println(sub.substring(0, 2));
		 String s2="hello";
		 String s3="hEllo";
		 System.out.println(s2.compareTo(s3));
		 
		 String s4="";
		 System.out.println(s4.isEmpty());
		 
		 String s5="Hello";
		 System.out.println(s5.toUpperCase());
		 String s6="heldo";
		 System.out.println(s6.replace('d', 'l'));
		 System.out.println("Creating String Buffer:");
		 StringBuffer s=new StringBuffer("First Name");
		 s.append("Last Name");
		 System.out.println(s);
		 s.insert(0, 'A');
		 System.out.println(s);
		 StringBuffer sb=new StringBuffer("Hello");
		 sb.replace(0, 2, "hEL");
		 System.out.println(sb);
		 sb.delete(0, 1);
		 System.out.println(sb);
		 System.out.println("creating strong builder");
		 StringBuilder sbl=new StringBuilder("Good");
		 sbl.append("Morning");
		 System.out.println(sbl);
		 System.out.println(sbl.delete(0, 1));
		 System.out.println(sbl.insert(1, "very"));
		 System.out.println(sbl.reverse());
		 System.out.println("conversion of string to string buffer");
		 String str="Hello";
		 StringBuffer sb1=new StringBuffer(str);
		 sb1.reverse();
		 System.out.println(sb1);
		 System.out.println("conversion of string to string builder");
		 StringBuilder sb2=new StringBuilder(str);
		 sb2.append(" world");
		 System.out.println(sb2);
		 
		 
		 
		 
		 
		
	}

}
