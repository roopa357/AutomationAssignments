package com.creatio.crm.language.basics;

public class EmpGroups_Ass3 {
	
	public static void main(String[] args) {
		
		//define 2D array to store the data
		String[] empNames = new String[3];
		int[] empIds = new int[3];
		
		//EmpNames
		Employees_Ass3 obj = new Employees_Ass3();
		empNames[0] = obj.empName1;
		empNames[1] = obj.empName2;
		empNames[2] = obj.empName3;
		
		//EmpIds
		empIds[0] = obj.empId1;
		empIds[1] = obj.empId2;
		empIds[2] = obj.empId3;
		
		System.out.println("Employee Name:" + empNames[0] +"," + "Employee Id:" + empIds[0]);
		System.out.println("Employee Name:" + empNames[1] +"," + "Employee Id:" + empIds[1]);
		System.out.println("Employee Name:" + empNames[2] +"," + "Employee Id:" + empIds[2]);
		
	}

}
