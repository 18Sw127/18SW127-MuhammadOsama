
class Person{
void Person(){
    System.out.println("Parent Class");
	System.out.println("PERSON");
}
}	
class Student extends Person{
	 void Student(){
		System.out.println("vacations hain");
		System.out.println("Student");
	}
}
class Undergraduate extends Student{
	void undergraduate(){
		System.out.println("dhaskdhaskdsa");
		System.out.println("undergraduate");
	}
}
class Graduate extends Student{
	void graduate(){
		System.out.println("fgasjfkashkajs");
		System.out.println("Graduate");

	}
}
class Master extends Graduate{
	void master(){
		System.out.println("Pfasd");
		System.out.println("Master");
	}

}
class Doctor extends Graduate{
	void doctor(){
		System.out.println("sdjsoisao");
		System.out.println("Doctor ban tou skty nhi");
	}
}
class Nondegree extends Graduate{
	void Nondegree(){
		System.out.println("mil jaegi tension nhi");
		System.out.println("Nondegree");
	}
}
class Employee extends Person{
	void Employee(){
		System.out.println("dasjkl");
		System.out.println("Employee");
	}
}
class Staffs extends Employee{
	void Staffs(){
		System.out.println("PEaafa");
		System.out.println("Staffs");
	}
}
class Faculty extends Employee{
	void Faculty(){
System.out.println("dasda");
System.out.println("Faculty");
	}
}

class Hireachy{
	public static void main(String []args){
		Faculty Obj2=new Faculty();
	Nondegree Obj1=new Nondegree();
	Obj2.Faculty();
	Obj2.Employee();
    Obj1.Person();
	Obj1.Nondegree();

	}
}