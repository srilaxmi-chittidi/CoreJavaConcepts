package coding.interview.java8streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeDetails {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(1, "Abc", 56, 123, "active");
		Employee emp2 = new Employee(2, "Bcd", 36 ,234,"inactive");
		Employee emp3 = new Employee(3, "Cde", 45 ,345 ,"active");
		Employee emp4 = new Employee(4, "Def", 74 ,123 ,"inactive");
		Employee emp5 = new Employee(5, "Egh", 12, 234,"active");
		
		List<Employee> empList = new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		//to print employee details working in each department
		Map<Integer,List<Employee>> map = empList.stream().
											collect(Collectors.groupingBy(Employee::getDeptId,Collectors.toList()));
		
		map.entrySet().forEach(e->
		{
			System.out.println(e.getKey()+"---------"+e.getValue());
		});
		
		//w.a.p to print employees count working in each department 
		
		Map<Integer,Long> mapByCount = empList.stream().collect(Collectors.groupingBy(Employee::getDeptId,Collectors.counting()));
		mapByCount.entrySet().forEach(e->
		{
			System.out.println(e.getKey()+"---------"+e.getValue());
		});
		
		//w.a.p to print active and inactive employees in the given collection? 
		Map<String,List<Employee>> mapByStatus = empList.stream().collect(Collectors.groupingBy(Employee::getStatus,Collectors.toList()));
		mapByStatus.entrySet().forEach(e->
		{
			System.out.println(e.getKey()+"---------"+e.getValue());
		});
		
		//w.a.p to print Max/Min employee salary from the given collection
		
		empList.stream().collect(Collectors.groupingBy(Employee::getSalary));
	}

}
class Employee implements Comparator<Employee> {
	private int empId;
	private String empName;
	private long salary;
	private int deptId;
	private String status;
	
	public Employee(int empId,String empName,long salary,int deptId,String status) {
		this.empId =empId;
		this.empName = empName;
		this.salary =salary;
		this.deptId =deptId;
		this.status = status;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String toString() {
		return this.getEmpId()+" "+this.getEmpName()+" "+this.getSalary()+" "+this.getDeptId()+" "+this.getSalary()+" "+this.getStatus();
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getSalary()-o2.getSalary() > 0)
			return 1;
		else
			if(o1.getSalary()-o2.getSalary() < 0)
				return -1;
			else
				return 0;
	}
	
}