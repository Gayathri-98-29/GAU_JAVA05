package java15;

import java.util.ArrayList;
import java.util.List;

public class List_01 {

	    public static void main(String[] args) {

	        //Creating List of String
	        List<String> stringList = new ArrayList<>();
	        stringList.add("Apple");
	        stringList.add("Orange");
	        stringList.add("Kiwi");

	        //Converting List to Array

	        String[] stringArray = new String[stringList.size()];
	        stringArray = stringList.toArray(stringArray);

	        // Printing the elements of the Array
	        System.out.println("Elements of the Array:");
	        for (String element : stringArray) {
	            System.out.println(element);
	        }

	    }
	}

