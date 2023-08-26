package com.info.ObjectComp;

import java.util.Objects;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp1 =new Employee(1,"A",3000);
        Employee emp2 =new Employee(2,"Z",2500);
        if(emp1.compareTo(emp2) > 0){
            System.out.println("emp1 has highest salary" );
        }else{
            System.out.println("emp2 has highest salary" );

        }
    }

}

class Employee implements  Comparable<Employee>{
    private int empId;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public long getSalary() {
        return this.salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    private String empName;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    private long salary;
    public Employee(int empId,String empName, long salary){
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId && Objects.equals(empName, employee.empName) && Objects.equals(salary, employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, empName, salary);
    }
    @Override
    public int compareTo(Employee o) {
        if(this.salary > o.getSalary())
            return 1;
        else  if(this.salary < o.getSalary())
                return -1;
        else
            return 0;
    }
}