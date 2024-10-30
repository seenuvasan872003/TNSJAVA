package Instance_variable;

import tostring.Employee;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		Employee e4=new Employee();
		
		
		e1.setEid(101);
		e1.setEname("seenuvasan");
		e1.setCity("villupuram");
		
		
		
		System.out.println("eid=" +e1.getEid()+ ", ename=" +e1.getEname()+ ", city=" + e1.getCity() );
				

	}

}

