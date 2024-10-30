package oops;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m1=100;
		employee e1=new employee();
		employee e2=new employee();
		employee e3=new employee();
		employee e4=new employee();
		
		
		e1.eid=101;
		e1.ename="seenu";
		e1.city="Villupuram";
		
		e2.eid=102;
		e2.ename="Bsaro";
		e2.city="Villupuram";
		
		e3.eid=103;
		e3.ename="Ssaro";
		e3.city="Villupuram";
		
		e4.eid=104;
		e4.ename="Ksaro";
		e4.city="Villupuram";
		
		System.out.println("eid:"+e1.eid+" Name:"+e1.ename+" City:"+e1.city);
		System.out.println("eid:"+e2.eid+" Name:"+e2.ename+" City:"+e2.city);
		System.out.println("eid:"+e3.eid+" Name:"+e3.ename+" City:"+e3.city);
		System.out.println("eid:"+e4.eid+" Name:"+e4.ename+" City:"+e4.city);
		

	}

}
