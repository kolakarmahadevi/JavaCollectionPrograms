package collection.arraylist;

import java.util.ArrayList;

public class Addelement {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(51);
		list.add(12);
		list.add("Hell");
		list.add('G');
		//Inserting at index 1
		list.add(1,false);
		list.add(0, 41.26f);
		System.out.println(list);
	}

}
