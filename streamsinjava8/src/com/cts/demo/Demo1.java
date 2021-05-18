package com.cts.demo;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class Demo1 {

	public static void main(String[] args) {
// Technique1
Collection<String> collection=Arrays.asList("hello","hi","bye");
Stream<String> data=collection.stream();		
System.out.println(data);

// Technique2
Stream<String> data2=Stream.of("hi","bye");
System.out.println(data2);
// Technique3
String array[]= {"abc","def","xyz"};
Stream<String> data3=Arrays.stream(array);
System.out.println(data3);

	}

}
