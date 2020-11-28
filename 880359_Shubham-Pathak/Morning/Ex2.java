package com.ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Map<String, List<String>> map = new HashMap<String, List<String>>();
		  List<String> l1 = new ArrayList<String>();
		  l1.add("Shubham");
		  l1.add("Kishor");
		  List<String> l2 = new ArrayList<String>();
		  l2.add("Enrique");
		  l2.add("Eminem");
		  map.put("CSE", l1);
		  map.put("EC", l2);
		  System.out.println("Branches and Students");
		  for (Map.Entry<String, List<String>> entry : map.entrySet())
		  {
		   String key = entry.getKey();
		   List<String> values = entry.getValue();
		   System.out.print("Branch = " + key +" ");
		   System.out.println("Students = " + values);
		  }

	}

}
