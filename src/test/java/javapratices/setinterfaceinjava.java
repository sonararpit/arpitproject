package javapratices;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setinterfaceinjava {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		//Appended the Specified Element to the end of this set
		set.add(null);
		set.add("AS");
		set.add("&&&&&&&&&&");
		set.add("Number");
		set.add("of");
		set.add("0");
		System.out.println(set);
		
		//Remove method is used to remove specific element form set
		set.remove("of");
		
		System.out.println("Size of set = "+set.size());
		
		//clear method is used for remove all present element
		//set.clear();
		
		System.out.println("Size of set = "+ set.size());
		
		System.out.println("Remove all element is in set = " + set.removeAll(set));
		System.out.println("set is Empty = "+set.isEmpty());
		System.out.println("Object is Available in set = "+ set.contains("Number"));
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		Iterator<String>it = set.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
