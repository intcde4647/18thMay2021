package com.cts.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Demo4 {

	public static void main(String[] args) {
		List<String> strings=new ArrayList<>();
        strings.add("Tom");
        strings.add("Jack");
        strings.add("");
        strings.add("Tahir");
        strings.add("");
        Predicate<String> predicate=nm->!nm.isEmpty();
    
        //List<String> data=strings.stream().filter(predicate).collect(Collectors.toList());
         long count=strings.stream().filter(nm->!nm.isEmpty()).count();
	     System.out.println(count);
	}

}
