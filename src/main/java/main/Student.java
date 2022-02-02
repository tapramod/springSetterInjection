package main;

public class Student {
	
  private int studentId;

	private String studentName;
	
	
	
	public int getStudentId() {
		return studentId;
	}



	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}



	public String getStudentName() {
		return studentName;
	}



	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}



	public void displayStudentDetails() {
		System.out.println("Student name is: "+studentName +" And id is :" +studentId);
	}
	
}
