package project;

public class admission_model {
	String Name,Phone,Dept;
	int marks;
	String eledept;
	
	
	public admission_model() {
		super();
	}


	public admission_model(String name, String phone, String dept, int marks) {
		super();
		Name = name;
		Phone = phone;
		Dept = dept;
		this.marks = marks;
		
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getPhone() {
		return Phone;
	}


	public void setPhone(String phone) {
		Phone = phone;
	}


	public String getDept() {
		return Dept;
	}


	public void setDept(String dept) {
		Dept = dept;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public String getEledept() {
		return eledept;
	}


	public void setEledept(String eledept) {
		this.eledept = eledept;
	}


	@Override
	public String toString() {
		return "admission_model [Name=" + Name + ", Phone=" + Phone + ", Dept=" + Dept + ", marks=" + marks
				+ ", eledept=" + eledept + "]";
	}
	
	
}
