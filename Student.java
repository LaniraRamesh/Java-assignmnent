package org.college;

public class Student extends Department{
	public void studentName(String name) {
		System.out.println("Student Name : "+name);
	}
	public void studentDept(String deptname) {
		System.out.println("Department name : "+deptname);
	}
	public void studentID(int id) {
		System.out.println("Student ID : "+id);
	}
	public static void main(String[] args) {
		Student details=new Student();
		details.collegeName("VIT");
		details.collegeCode(45697);
		details.collegeRank(8);
		details.deptName("Fashion Technology");
		details.studentID(1825645);
		details.studentName("LANIRA");
		
	}


}
