class Employee 
{
	int empno;
	String name;
	float sal;
	
	void setDetails(){
		name = "Praveen";
		sal = 5000f;
	}

	void getDetails(){
		System.out.println(empno + " | " + name + " | " + sal);
	}
	public static void main(String[] args) {
		System.out.println("in employee class");
	}
}

class ObjectTest
{
	public static void main(String[] args) 
	{
		//--creating an instance of employee type
		Employee emp = new Employee();

		//-- accessing the state of object using reference
		System.out.println(emp.empno + " | " + emp.name + " | " + emp.sal);

		//-- accessing the state of object using method
		emp.getDetails();

		//-- changing the state of instance using reference
		emp.empno = 101;
		emp.name = "Sunil";
		emp.sal = 2500.5f;

		emp.getDetails();

		//-- changing the state of instance using method
		emp.setDetails();
		emp.getDetails();
	}
}