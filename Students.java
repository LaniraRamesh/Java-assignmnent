package org.system;



public class Students {
	public void getStudentInfo(String name) {
		System.out.println("Student Name : "+name);
	}
	public void getStudentInfo(int rollno) {
	    System.out.println("Student Roll No : "+rollno);
	}
	public void getStudentInfo(long phonenumber) {
		System.out.println("Student Phone Number : "+phonenumber);
	}
	public static void main(String[] args) {
		Students details=new Students();
		details.getStudentInfo("LANIRA");
		details.getStudentInfo(1452);
		details.getStudentInfo(984563278);
	}

}
