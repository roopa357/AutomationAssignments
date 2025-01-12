package com.creatio.crm.language.basics;


public class StudentTest_Ass10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentGrades_Ass10 studentGrades = new StudentGrades_Ass10();

		// Adding some initial students
		studentGrades.addNewStudentGrade("John", 85);
		studentGrades.addNewStudentGrade("Alice", 92);
		studentGrades.addNewStudentGrade("Bob", 78);

		// Removing student
		studentGrades.removeGrade("Alice");
		
		// View student record
		studentGrades.viewGrades("Alice");
		studentGrades.viewGrades("John");
		
		// Display all student records
		studentGrades.studentGrades();
		
	}



	}


