import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
public class Test {

	public static void main(String[] args) {
		
        String s1 = "Sai";
        String s2 = "ias"; 
        String s3 = "Sai"; 
        String s4 = new String("Sai");
        System.out.println(s1.equals(s4));
        System.out.println(s1==s4);
        boolean status = true;  
        if (s1.length() != s2.length()) {  
            status = false;  
        } else {  
            char[] arrayS1 = s1.toLowerCase().toCharArray();  
            char[] arrayS2 = s2.toLowerCase().toCharArray();  
            Arrays.sort(arrayS1);  
            Arrays.sort(arrayS2);  
            status = Arrays.equals(arrayS1, arrayS2);  
        }  
        if (status) {  
            System.out.println(s1 + " and " + s2 + " are anagrams");  
        } else {  
            System.out.println(s1 + " and " + s2 + " are not anagrams");  
        }  
        List<String> listOfStrings = Arrays.asList("1", "2", "3", "4", "5");
        
        List<Integer> listOfIntegers = listOfStrings.stream()
                .map(Integer::valueOf)
                .collect(Collectors.toList());
         
        System.out.println(listOfIntegers);

        List<Employee> employeesList = Arrays.asList(
                                            new Employee( "Alex","s" ,100),
                                            new Employee( "Brian","s" , 100),
                                            new Employee( "Charles","s" , 200),
                                            new Employee( "David","s" , 200),
                                            new Employee( "Edward","s" , 300),
                                            new Employee( "Frank","s" , 300)
                                        );
          
       List<Employee> l = employeesList.stream().filter((e)->e.getSalary()>200)
                                .collect(Collectors.toList());
  
        System.out.println(l);
        System.out.println(employeesList);
        
	}
 
}
