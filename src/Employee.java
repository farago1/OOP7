import java.time.LocalDate;


public class Employee {
	
	private String employeeName;
	private long salary;
//	private int age;
	private LocalDate birthday;
	
	static int retirementAge= 65;
	
	public Employee(String employeeName, long salary, LocalDate birthday) {
		super();
		this.employeeName = employeeName;
		this.salary = salary;
//		this.age = age;
		this.birthday= birthday;
	}
	public Employee(String employeeName, LocalDate birthday) {
		super();
		this.employeeName = employeeName;
//		this.age = age;
		this.birthday = birthday;
		this.salary= ( LocalDate.now().getYear()-birthday.getYear() )*10000;
	}

	public long increaseSalary (long increase, long salary) {
		return salary+=increase;
	}
	
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
  	public int getAge() {
		return LocalDate.now().getYear()-birthday.getYear();
	}	


	
	public static int getRetirementAge() {
		return retirementAge;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	public static void setRetirementAge(int retirementAge) {
		Employee.retirementAge = retirementAge;
	}
	
	
	public int untilRetirement() {
		return retirementAge-getAge();
	}
	
	public static Employee youngerEmployee(Employee e1, Employee e2){
		if (e1.untilRetirement() > e2.untilRetirement()) {
			return e1;
		} else return e2;
	}
	
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", salary=" + salary
				+ ", untilRetirement()=" + untilRetirement() + "]";
	}

	public boolean isInSalaryRange(long salaryStart, long salaryEnd) {
		if (salaryStart<=this.salary && this.salary<salaryEnd) {
			return true;
		} else return false;
	}
	
	public long getTax() {
		return (long)(this.salary*0.16);
	}
	
	public boolean higherSalary(Employee employee) {
		if (this.salary > employee.salary) {
			return true;
		} else return false;
	}
	
}
