import java.util.*;
class ArrayListExample{
	public static void main(String[] args){
		ArrayList al = new ArrayList();
		System.out.println("Array List Size: "+al.size());
		al.add(1);
		al.add("Hello");
		al.add('a');
		al.add(true);
		al.add(10.0);
		System.out.println("Array List Size: "+al.size());
		for(Object o : al){
			System.out.println(o);
		}
		al.add(0,"First");
		al.add(al.size(),"Last");
		al.add(2,"Third");
		System.out.println("Array List Size: "+al.size());
		for(Object o : al){
			System.out.println(o);
		}
		al.remove("Third");
		System.out.println("Array List Size: "+al.size());
		for(Object o : al){
			System.out.println(o);
		}
		Object ob[] = new Object[al.size()];
		ob = al.toArray();
		for(Object o : ob){
			System.out.println(o);
		}
	}
}