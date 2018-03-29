import java.util.Scanner;
// employee age [B]roke

public class Main {

	public static void main(String[] args) {
	
		Scanner scanner= new Scanner(System.in);
		System.out.println("number of employees:");
		int n= scanner.nextInt();
	
		Employee[] employeeArray=new Employee[n]; 
		for (int i = 0; i < employeeArray.length; i++) {
			System.out.println("input name pls");
			String tempName= scanner.next();
			System.out.println("input age pls");
			int tempAge= scanner.nextInt();
		
			employeeArray[i]= new Employee(tempName, tempAge);
			}
		scanner.close();
		
		for (int i = 0; i < employeeArray.length; i++) {
			System.out.println(employeeArray[i]);
			}
	/*	Employee.setRetirementAge(75);
		for (int i = 0; i < employeeArray.length; i++) {
			System.out.println(employeeArray[i]);
		} 
	*/
		for (Employee employee : employeeArray) {
			if (employee.untilRetirement()<5){
				System.out.println(employee);
				}
			}
		
		int avgUntilRetirement= 0;
		for (Employee employee : employeeArray) {
			avgUntilRetirement+= employee.untilRetirement();
			avgUntilRetirement= avgUntilRetirement/employeeArray.length;
			}
		
		for (Employee employee : employeeArray) {
			if (employee.untilRetirement()> avgUntilRetirement) {
				System.out.println(employee);
				}
			}
		
		for (int i = 0; i < employeeArray.length-1; i++) {
			int max=i;
			for (int j = i+1; j < employeeArray.length; j++) {
				if (employeeArray[max].untilRetirement()< employeeArray[j].untilRetirement()) {
					max=j;
					}
				}
			Employee tEmployee= new Employee(employeeArray[i].getEmployeeName(), employeeArray[i].getAge());
			employeeArray[i]= new Employee(employeeArray[max].getEmployeeName(), employeeArray[max].getAge());
			employeeArray[max]= new Employee(tEmployee.getEmployeeName(), tEmployee.getAge());
			}
		for (Employee employee : employeeArray) {
			System.out.println(employee);
			}
		
		for (int i = 0; i < employeeArray.length-1; i++) {
			int min=i;
			for (int j = i+1; j < employeeArray.length; j++) {
				if (employeeArray[min].untilRetirement()> employeeArray[j].untilRetirement()) {
					min=j;
					}
				}
			Employee tEmployee= new Employee(employeeArray[i].getEmployeeName(), employeeArray[i].getAge());
			employeeArray[i]= new Employee(employeeArray[min].getEmployeeName(), employeeArray[min].getAge());
			employeeArray[min]= new Employee(tEmployee.getEmployeeName(), tEmployee.getAge());
			}
		for (Employee employee : employeeArray) {
			System.out.println(employee);
			}
		
		
	}	
}
