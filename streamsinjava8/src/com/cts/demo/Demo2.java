package com.cts.demo;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
		List<String> strings=new ArrayList<>();
        strings.add("Tom");
        strings.add("Jack");
        strings.add("");
        strings.add("Tahir");
        strings.add("");
        for(String name : strings)
        {
        	if(!name.isEmpty())
        	{
        		System.out.println(name);
        	}
        }
        
	}

}
