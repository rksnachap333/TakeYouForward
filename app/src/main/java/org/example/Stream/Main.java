package org.example.Stream;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    /*
    Intermediate Operations-> filter(), map(), sorted(), distinct(), limit(), skip()
    Terminal Operation -> collect(), forEach(), reduce(), count(), findFirst(), anyMatch(), allMatch()
     */

    static class Employee {
        int id;
        String name;
        double salary;

        public Employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }

    private static Employee[] arrayOfEmps = {
            new Employee(1, "Jeff Bezos", 100000.0),
            new Employee(2, "Bill Gates", 200000.0),
            new Employee(3, "Mark Zuckerberg", 300000.0)
    };

    public static void main(String[] args) {
        System.out.println("----------------Stream Examples-----------------");
        filteringAndCollecting();
        mappingAndIterating();
        reducing();
        sorting();
        flattenMap();
        peekOp();
    }

    /*
    Filtering and then collecting
     */
    private static void filteringAndCollecting() {
        List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> evenNumber = number
                .stream()
                .filter(num -> num %2 == 0)
                .collect(Collectors.toList());

        System.out.print("Even Numbers from Number is ===>");
        for(Integer num : evenNumber) {
            System.out.print(num + " ");
        }
        System.out.println();
        List<String> names = Arrays.asList("Alice", "Bob", "Anna", "Charlie", "Amy");

        System.out.println();
        List<String> filteredName = names
                .stream()
                .filter(str -> str.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("Names starting with 'A': " + filteredName); // Output: [Alice, Anna, Amy]


        List<Employee> empoyees = Arrays.asList(arrayOfEmps);
        List<Employee> filteredEmployee = empoyees.stream()
                .filter(emp -> emp.salary > 100000)
                .collect(Collectors.toList());
        System.out.print("Filtered Employee List ===> ");
        for(Employee emp : filteredEmployee) {
            System.out.print(emp.name + ", ");
        }
        System.out.println();

    }

    /*
    Mapping and iterating
     */
    private static void mappingAndIterating() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Mapping the number list with there double");
        numbers.stream()
                .map(num -> num * 2)
                .forEach(System.out::println);

        List<Employee> empoyees = Arrays.asList(arrayOfEmps);
        List<Employee> mappedEmployee = empoyees.stream()
                .map(emp -> new Employee(emp.id, emp.name, emp.salary * 2))
                .collect(Collectors.toList());

        System.out.println("Employee after mapped with double salary ===> "+mappedEmployee.size());
        for(Employee emp : mappedEmployee) {
            System.out.println(emp.toString());
        }
        System.out.println();
    }

    private static void reducing() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Reducing the list by adding all the element");
        Optional<Integer> sum = numbers.stream()
                .reduce((a,b) -> a+b);

        sum.ifPresent(s-> System.out.println("Sum of number : "+s));
    }

    private static void sorting() {
        List<String> fruits = Arrays.asList("Orange", "Apple", "Banana", "Grape");
        List<String> sortedFruits = fruits.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Sorted fruits are ==> "+sortedFruits);
    }

    private static void findFirstUse() {
        List<Employee> empoyees = Arrays.asList(arrayOfEmps);
        Integer[] empIds = { 1, 2, 3, 4 };
//        Employee mappedEmployee = Stream.of(empIds)
//                .map(employeeRepository::findById)
//                .filter(e -> e != null)
//                .filter(e -> e.getSalary() > 100000)
//                .findFirst()
//                .orElse(null);
    }

    private static void flattenMap() {
        List<List<String>> namesNested = Arrays.asList(
                Arrays.asList("Jeff", "Bezos"),
                Arrays.asList("Bill", "Gates"),
                Arrays.asList("Mark", "Zuckerberg"));

        List<String> namesFlatStream = namesNested.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println("Flatten list ====> "+namesFlatStream);
    }

    private static void peekOp() {
        List<Integer> data = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> peekOp = data.stream()
                .peek(e -> System.out.println("Value: " + e))
                .map(e -> e+10)
                .map(e -> e * 2)
                .collect(Collectors.toList());

        System.out.println("Peek OP ==> "+peekOp);

    }
}
