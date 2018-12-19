package sabya;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Features {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Hello Sabya");
		Optional<String> optional = Optional.ofNullable("String");
		System.out.println(optional.isPresent());
		System.out.println(optional.get());
		
		FuncInterface fobj = (int x, String str)->System.out.println(2*x+str);
		fobj.abstractFun(5, "Hello");
		
		FunctInterface1 fobj1 = (int x, int y)->x*y;
		int z = fobj1.abstractFun1(15, 15);		
		System.out.println(z);
		
		
		Employee[] arrayOfEmps = {
			    new Employee(1, "Jeff Bezos", 100000.0), 
			    new Employee(2, "Bill Gates", 200000.0), 
			    new Employee(3, "Mark Zuckerberg", 300000.0)
			};

		List<Employee> empList = Arrays.asList(arrayOfEmps);
		
		Stream<Employee> empStream = empList.stream();
		
//		empStream.forEach(e->e.bonus(100));	
//
//		System.out.println(empList.get(1).getSalary());
		
		empStream.filter(e -> e != null)
		.peek(e->e.bonus(100))
		.peek(System.out::println)
		.collect(Collectors.toList());

		
	}

}
