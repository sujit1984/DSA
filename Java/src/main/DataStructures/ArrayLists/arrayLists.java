package main.DataStructures.ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class arrayLists {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Austen", 1));
        employeeList.add(new Employee("Roger", "Smith", 11));
        employeeList.add(new Employee("James", "Bond", 131));
        employeeList.add(new Employee("Ravi", "Chatterjee", 141));


        //We can iterate over the list of Employees and print them out.
        employeeList.forEach(employee -> System.out.println(employee));


        //Now if we want to get the third employee in the list we can use the following
        System.out.println(employeeList.get(2));

        //To check if the given array list is empty or not
        System.out.println(employeeList.isEmpty());

        //Now if we want to replace the employee data at x index with a new employee data
        employeeList.set(1,  new Employee("Arindam", "Bhanu", 1333));
        System.out.println(employeeList.get(1));
        employeeList.forEach(employee -> System.out.println(employee));

        //Getting the number of items in the list or the size of the list.
        System.out.println(employeeList.size());

        //Adding an item at the middle of list
        employeeList.add(3, new Employee("Arjun", "Reddy", 879));
        employeeList.forEach(employee -> System.out.println(employee));

    }
}
