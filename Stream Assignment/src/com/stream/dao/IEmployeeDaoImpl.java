package com.stream.dao;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.stream.model.Department;
import com.stream.model.Employee;

public class IEmployeeDaoImpl implements IEmployee {

	@Override
	public double sumOfSalaryOfAllEmployees(ArrayList<Employee> employees) {

		
		double a = employees.stream().collect(Collectors.summarizingDouble(Employee::getSalary)).getSum();
double b = employees.stream().
		return a;
	}

	@Override
	public Map<Department, Long> employeeCountByDepartment(ArrayList<Employee> employees) {

		Map<Department, Long> employeeCountByDepartment = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

		for (Map.Entry<Department, Long> entry : employeeCountByDepartment.entrySet())
			System.out.println(
					"Department = " + entry.getKey().getDepartmentName() + ",       Count = " + entry.getValue());

		return employeeCountByDepartment;
	}

	@Override
	public void seniorMostEmp(ArrayList<Employee> employees) {
		// TODO Auto-generated method stub

		// Employee a =
		// employees.stream().minBy(Comparator.comparing(a->a.getHireDate));
		// employees.stream().sorted(Comparator.comparing(a ->
		// a.getName()).collect(Collectors.toList());
//		Date minDate = employees.stream()
//                .min( Comparator.comparing( Date::toEpochDay ) )
//                .get();
//		
	}

	@Override
	public void employeeDuration(ArrayList<Employee> employees) {
		// TODO Auto-generated method stub
		employees.stream().map(i -> i.getFirstName() + " " + i.getLastName() + "  " + i.getHireDate().getMonth() + " "
				+ i.getHireDate().getYear()).forEach(i -> System.out.println(i));

	}

	@Override
	public void employeeWithoutDepartment(ArrayList<Employee> employees) {
		// TODO Auto-generated method stub
		employees.stream().filter(i -> i.getDepartment() == null).forEach(i -> System.out.println(i));
	}

	@Override
	public void deptWithoutEmp(List<Department> departments) {
		// TODO Auto-generated method stub
		departments.stream().filter(i -> i.getManageId() == 0).forEach(System.out::println);

	}

	@Override
	public void deptWithHighestCountOfEmp(ArrayList<Employee> employees) {
		// TODO Auto-generated method stub
		Map<Department, Long> m = employees.stream().filter(i -> i.getDepartment() != null)
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

		for (Map.Entry<Department, Long> entry : m.entrySet())
			System.out.println(
					"Department = " + entry.getKey().getDepartmentName() + ",       Count = " + entry.getValue());

	}

	@Override
	public void empNameDayDateDetails(ArrayList<Employee> employees) {
		// TODO Auto-generated method stub

		employees.stream().forEach(i -> System.out.println(i.getFirstName() + " " + i.getLastName() + " "
				+ i.getHireDate().getDate() + " " + i.getHireDate().getDay()));
	}

	@Override
	public void empNameDetailsHired(ArrayList<Employee> employees, String string) {

		employees.stream().filter(a -> a.getHireDate().getDay() == 5).forEach(System.out::println);

	}

	@Override
	public void empDetailsReportToManager(ArrayList<Employee> employees) {
		// TODO Auto-generated method stub
		employees.stream().forEach(i -> System.out
				.println(i.getFirstName() + " " + i.getLastName() + " report to " + i.getManagerId() + " manager"));

	}

	@Override
	public void empSalaryIncreasesBy(ArrayList<Employee> employees, int p) {
		// TODO Auto-generated method stub

		employees.stream().forEach(i -> System.out.println(i.getFirstName() + " " + i.getLastName() + " salary "
				+ i.getSalary() + " increases by " + p + " is " + (i.getSalary() + i.getSalary() * (p / 100.00))));

	}

	@Override
	public void sortAll(ArrayList<Employee> employees, List<Department> departments) {
		// TODO Auto-generated method stub

		System.out.println("\nSort by Emp id \n");
		employees.stream().sorted(Comparator.comparingInt(Employee::getEmployeeId)).forEach(System.out::println);

		System.out.println("\nSort by Department id");

		// departments.stream().sorted(Comparator.comparingInt(Department::getDepartmentId).forEach(System.out::println);

	}

}
