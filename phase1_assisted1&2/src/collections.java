import java.util.*;
public class collections {
	public static void main(String[] args) {
	System.out.println("array list.");
	ArrayList<String> city=new ArrayList<String>();
	city.add("Gwalior");
	city.add("Indore");
	System.out.println(city);
	System.out.println("\n");
	System.out.println("vectors");
	Vector<Integer> vec=new Vector<Integer>();
	vec.addElement(29);
	vec.addElement(18);
	System.out.println(vec);
	System.out.println("\n");
	System.out.println("linked list");
	LinkedList<String> obj=new LinkedList<String>();
	obj.add("MAX");
	obj.add("SAM");
	/*Iterator<String> itr=obj.iterator();
    while(itr.hasNext()) {
    	System.out.println(itr.hasNext());
    }*/

	System.out.println(obj);
	System.out.println("\n");
	System.out.println("Hash Set");
	HashSet<Integer> obj1=new HashSet<Integer>();
	obj1.add(100);
	obj1.add(200);
	obj1.add(300);
	System.out.println(obj1);
	System.out.println("Linked Hash Set");
	LinkedHashSet<Integer> obj2=new LinkedHashSet<Integer>();
	obj2.add(900);
	obj2.add(901);
	obj2.add(903);
	obj2.add(904);
	System.out.println(obj2);
	}

}
