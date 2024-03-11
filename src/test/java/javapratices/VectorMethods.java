package javapratices;

import java.util.Iterator;
import java.util.Vector;

public class VectorMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> v = new Vector<String>();
		
		v.add("sachin");
		v.add("virat");
		v.add("hardik");
		
		Iterator<String> i = v.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println(v.contains("sachin"));
		System.out.println(v.size());
	}

}
