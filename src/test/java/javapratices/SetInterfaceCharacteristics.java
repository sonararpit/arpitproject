package javapratices;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetInterfaceCharacteristics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(10);
		set.add(20);
		set.add(2);
		set.add(5);
		set.add(50);
		set.add(7);
		set.add(20);
		set.add(null);
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
