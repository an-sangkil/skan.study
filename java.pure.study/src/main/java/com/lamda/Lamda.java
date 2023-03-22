package com.lamda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Lamda {
	// SAMPLE
	static List<String> strList = new ArrayList<>();
	{
		strList.add("a");
		strList.add("b");
		strList.add("b");
		strList.add("c");
		strList.add("d");
	}


	public static void main(String... args) throws Exception {
		Lamda lamda = new Lamda();
		lamda.default_stream_filter_test(strList);
	}


    public void default_stream_filter_test(List<String> strList) {

        String tempStr = strList.stream().findFirst().orElseGet(()-> "");
        System.out.println("first data = " + tempStr);
        long count = strList.stream().filter(x -> x.equals("c")).count();
        System.out.println("'c' charter set count = " + count);

        List<String> strLists = strList.stream().filter(x -> x.equals("b")).collect(Collectors.toList());
        for (Iterator<String> iterator = strLists.iterator(); iterator.hasNext(); ) {
            String string = (String) iterator.next();
            System.out.println(string);
        }

    }


}
