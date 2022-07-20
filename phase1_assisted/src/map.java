import java.util.*;
public class map {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "Harry");
		hm.put(2, "Jaby");
		System.out.println("the elements of hashmap are:");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		ht.put(3, "john");
		ht.put(4, "Sam");
		System.out.println("the elements of hashtable are:");
		for(Map.Entry n:ht.entrySet()) {
			System.out.println(n.getKey()+" "+n.getValue());
		}
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		tm.put(5, "Max");
		tm.put(6, "Jeff");
		System.out.println("the elements of treemap are:");
		for(Map.Entry x:tm.entrySet()) {
			System.out.println(x.getKey()+" "+x.getValue());
		}
		
		
	}
	

}
