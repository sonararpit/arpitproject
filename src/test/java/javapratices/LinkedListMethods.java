package javapratices;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		//Appends the specified element to the end of this list.
		linkedList.add(1);
		linkedList.add(3);
		linkedList.add(2);
		linkedList.add(5);

		LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
		linkedList2.addAll(linkedList);
		linkedList2.add(10);
		linkedList2.add(20);
		linkedList2.remove(4);

		for (Integer i : linkedList2){
			System.out.println(i);
		}

		//boolean b= linkedList2.removeAll(linkedList);
		//System.out.println(b);

		//b=linkedList2.removeAll(linkedList);
		//System.out.println(b);

		//linkedList2.clear();

		System.out.println("##############################");

		System.out.println("size of linkedList2 = "+ linkedList2.size());

		for (Integer i : linkedList2){
			System.out.println(i);
		}

		System.out.println("*********************************");
		System.out.println("object is availble in list is ="+ linkedList2.contains(1));

		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$");

		System.out.println("List is empty = " + linkedList2.isEmpty());

		//linkedList.clear();

		System.out.println("List is empty = "+ linkedList2.isEmpty());

		Iterator<Integer>it = linkedList2.iterator();

		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println(linkedList2.get(3));
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&");
		for(int i = 0;i<linkedList2.size();i++){
			if(linkedList2.get(i) % 2 == 0){
				System.out.println(linkedList2.get(i));
				break;
			}else{
				continue;
			}
		}
	}
}

