package sabya;

public class Employee {
	int id;
	String Name;
	double Salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		Name = name;
		Salary = salary;
	}
	
	public void bonus(double d) {
		this.Salary = this.Salary+d;
	}
	

}
