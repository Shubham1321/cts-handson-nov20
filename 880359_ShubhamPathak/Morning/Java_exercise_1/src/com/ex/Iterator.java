package com.ex;

import java.util.ArrayList;
import java.util.List;



public class Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<User> list = new ArrayList<User>();
		list.add(new User(1, "Kishor", "kishorc"));
		list.add(new User(2, "Shubham", "123"));
		list.add(new User(3, "Ananya", "1234"));
		list.add(new User(4, "Aman", "1223"));
		list.add(new User(5, "Eminem", "shady"));
		
		for(User user : list) 
		{
			if(user.getName().length() > 5) 
				System.out.println(user);
		}

}
}
