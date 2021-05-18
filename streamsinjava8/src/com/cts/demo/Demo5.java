package com.cts.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Demo5 {

	public static void main(String[] args) {
		List<String> strings=new ArrayList<>();
        strings.add("Tom");
        strings.add("Jack");
        strings.add("");
        strings.add("Tahir");
        strings.add("");
        Predicate<String> predicate=nm->!nm.isEmpty();
    
		/*
		 * strings.stream() //creating the stream .filter(name->name.startsWith("T"))
		 * .forEach(nm->System.out.println(nm));
		 */
         
         List <String> collect = strings.stream().filter(name->name.startsWith("T")).
        collect(Collectors.toList());
         System.out.println(collect);
         for(String n : collect)
         {
        	 System.out.println(n);
         }
	}

}
