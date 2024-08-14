package java15;

import java.util.TreeMap;

public class Tree {

    public static void main(String[] args) {
        // Creating a TreeMap to store employee IDs and names
        TreeMap<Integer, String> employeeMap = new TreeMap<>();

        // Adding employees to the TreeMap
        employeeMap.put(123, "gau");
        employeeMap.put(122, "surabi");
        employeeMap.put(125, "vishal");
        employeeMap.put(124, "Naveena");

        // Printing the names of all employees in alphabetical order
        System.out.println("Names of employees in alphabetical order: ");

        for (String name : employeeMap.values()){
            System.out.println(name);
        }

    }
}
