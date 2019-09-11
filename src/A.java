import java.util.HashMap;
import java.util.Map;


public class A {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee();
		Map<Employee,String> m = new HashMap<>();
		m.put(e,"a");
		m.put(e1, "b");
		m.put(e3, "c");
		m.put(e4, "d");
		m.put(e2, "e");
		
		System.out.println(m);
		System.out.println(m.get(e));
	}

	
}