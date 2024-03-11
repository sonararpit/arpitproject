package javapratices;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListIntegerfaceImpl_8_March {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l = new ArrayList();
		//Store Heterogeneous objects
		System.out.println("\nStore Heterogeneous objects");
		l.add(10); 	//its shows waring in yellow color underline
		l.add(5.5f);
		l.add("ABC");
		l.add('j');

		for (int i =0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
		System.out.println("---------------------------------");

		//generic <E> :--
		//With Generic, it is required to specify the type of object we need to store.

		System.out.println("\n----------------ArrayList-----------------");
		ArrayList<Integer>arrayList = new ArrayList<Integer>();

		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(10);		//allow to store duplicate elements.
		arrayList.add(null);	//allow to insert value
		arrayList.add(100);
		arrayList.add(200);
		ArrayList<String>arraystring = new ArrayList<String>();

		arraystring.add("java");
		arraystring.add("Advance");

		ArrayList<Float>arrayFloat = new ArrayList<Float>();

		arrayFloat.add(11.11f);
		arrayFloat.add(22.22f);

		System.out.println("\nPrint the value of Integer type :");
		for(int j =0; j<arrayList.size();j++)
		{
			System.out.println(arrayList.get(j));
		}

		System.out.println("\nprint the value of String type :");
		for(int p =0; p<arraystring.size();p++)
		{
			System.out.println(arraystring.get(p));
		}
		System.out.println("\nPrint the value of Float type :");
		for(int q =0;q<arrayFloat.size();q++)
		{
			System.out.println(arrayFloat.get(q));
		}

		System.out.println("---------------------------------------------");

		System.out.println("\n----------------LinkedList----------------");
		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		linkedList.add(100);
		linkedList.add(200);
		linkedList.add(100);		//allow to store duplicate elements.
		linkedList.add(null);		//allow to insert value

		LinkedList<String> linkedstring = new LinkedList<String>();

		linkedstring.add("ArpitSonar");
		linkedstring.add("Vilassonar");

		LinkedList<Float> linkedFloat = new LinkedList<Float>();
		linkedFloat.add(11.11f);
		linkedFloat.add(22.22f);

		System.out.println("\nPrint the value of Integer type");
		for (int j =0; j<linkedList.size();j++)
		{
			System.out.println(linkedList.get(j));
		}

		System.out.println("\nPrint the value of String type :");
		for (int p =0;p<linkedstring.size();p++)
		{
			System.out.println(linkedstring.get(p));
		}

		System.out.println("\nPrint the value of Float type :");
		for (int q =0;q<linkedFloat.size();q++)
		{
			System.out.println(linkedFloat.get(q));
		}

		//ArrayList Methods:-----

		//add see above
		//add all

		ArrayList<Integer>arrlist = new ArrayList<Integer>();
		arrlist.addAll(arrayList);
		arrlist.add(555555);
		arrlist.add(6666666);

		//addAll method:------
		System.out.println("\nAdd and Print the value of arrayList using addAll method:");
		for(Integer m :arrlist)
		{
			System.out.println(m);
		}

		//remove method:------------------------
		System.out.println("\nRemove and Print the value of arrlist after removeing using 'remove'method:");
		arrlist.remove(3);

		for(Integer n :arrlist)
		{
			System.out.println(n);
		}

		//remove all
		System.out.println("\nRemove all and Print the value of arraylist after removing all using 'removeAll' method");
		arrlist.remove(arrayList);

		for(Integer o :arrlist)
		{
			System.out.println(o);
		}
	}

}
