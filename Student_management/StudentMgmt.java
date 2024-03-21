package A_Student_management;
import java.util.*;
class Student {
	@Override
	public String toString() {
		return "Student [Regno=" + Regno + ", name=" + name + ", gender=" + gender + ", cgpa=" + cgpa + ", dept=" + dept
				+ ", year=" + year + "]";
	}

	String Regno,name,gender,cgpa,dept,year;
	public Student(String regno, String name, String gender, String cgpa, String dept, String year) {
		super();
		Regno = regno;
		this.name = name;
		this.gender = gender;
		this.cgpa = cgpa;
		this.dept = dept;
		this.year = year;
	}


	public Student() {
		super();
	}




	public String getRegno() {
		return Regno;
	}

	public void setRegno(String regno) {
		Regno = regno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCgpa() {
		return cgpa;
	}

	public void setCgpa(String cgpa) {
		this.cgpa = cgpa;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}

public class StudentMgmt {
	 Scanner sc=new Scanner(System.in);
	 Student sd=new Student();
List <Student> stu= new ArrayList();

	 public static void main(String[] args) {
		StudentMgmt smg=new StudentMgmt();
		smg.menu();
		}
	 
	 
	 private void menu() {
		 System.out.println(" \t \t Dr.VIGNESH PRABHU COLLEGE OF ENGINEERING AND TECHNOLOGY  ");
			System.out.println(" \t \t \t Pollachi, Kolarpatti District.  ");
	        int choice;
	        do {
	            System.out.println("1. Add Student\n2. Remove Student\n3. Update Student\n4. Search Students\n5. Show\n6. Exit");
	            choice = sc.nextInt();
	            switch (choice) {
	                case 1:
	                    addStudent();
	                    break;
	                case 2:
	                    removeStudent();
	                    break;
	                case 3:
	                    update();
	                    break;
	                case 4:
	                    search();
	                    break;
	                case 5: 
	                	display(stu);
	                	break;
	                case 6:
	                    System.out.println("Exiting...");
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
	            }
	        } while (choice != 6);
	    }
		
	

	private void addStudent() {
		System.out.println("---------- INSERT RECORDS  ----------");

		System.out.println("Enter Number of Records to be added");
		int n1=sc.nextInt();
		for(int i=0;i<n1;i++) {
			System.out.println("Enter Student Reg NO :");
			String no=sc.next();
			System.out.println("Enter Student Name :");
			String n=sc.next().toUpperCase();
			System.out.println("Enter Student Gender :");
			String gen=sc.next().toUpperCase();
			System.out.println("Enter Student CGPA :");
			String cg=sc.next().toUpperCase();
			System.out.println("Enter Student's Department :");
			String dep=sc.next().toUpperCase();
			System.out.println("Enter Student Persuing Year :");
			String y=sc.next();
			
			Student sd=new Student(no,n,gen,cg,dep,y);
			stu.add(sd);
		}
		System.out.println("Data Inserted Successfully !! ");
	}
	
	
	private void display(List<Student> stu) {
		if(stu.size()<0) {
			System.out.println("No records");
		}
		else {
			Collections.sort(stu,(o1,o2)-> o1.getName().compareTo(o2.getName()));
		for( Student rec:stu) {
		System.out.println(rec);}
	}}

	private  void removeStudent() {
		System.out.println("---------- DELETE RECORDS  ----------");
		System.out.println("Enter Id to delete ");
		String id=sc.next();
		int flag =0;
	for(int i=0;i<stu.size();i++) {
		if(stu.get(i).getRegno().equals(id)) 
		{
			flag=1;
		stu.remove(i);
		System.out.println("Record Deleted Successfully!!");
	}
	}
	if(flag==0)
	{
		System.out.println("No Record Found ");
	}}
	
	
	private void update() {
		System.out.println("---------- UPDATE RECORDS  ----------");

	    System.out.println("Enter Id to Update Student Details");
	    String id = sc.next();
	    int flag=0;
	    for (Student student : stu) {
	    	String sd=student.getRegno();
	        if (sd==id) {
	        	flag =1;
	        	System.out.println(student);
	            System.out.println("1. Update Name\n2. Update Gender\n3. Update Cgpa\n4. Update Department\n5. Update Persuing Year");
	            System.out.println("Enter Your choice");
	            int choice = sc.nextInt();
	            switch (choice) {
	                case 1:
	                    System.out.println("Enter Name : ");
	                    String n = sc.next().toUpperCase();
	                    student.setName(n);
	    	        	System.out.println(student);
	                    System.out.println("Successfully Updated Name");
	                    break;
	                case 2:
	                    System.out.println("Enter Gender : ");
	                    String gen = sc.next().toUpperCase();
	                    student.setGender(gen);
	    	        	System.out.println(student);
	                    System.out.println("Successfully Updated Gender");
	                    break;
	                case 3:
	                    System.out.println("Enter CGPA : ");
	                    String cg = sc.next().toUpperCase();
	                    student.setCgpa(cg);
	    	        	System.out.println(student);
	                    System.out.println("Successfully Updated CGPA");
	                    break;
	                case 4:
	                    System.out.println("Enter Department : ");
	                    String dep = sc.next().toUpperCase();
	                    student.setDept(dep);
	    	        	System.out.println(student);
	                    System.out.println("Successfully Updated Department");
	                    break;
	                case 5:
	                    System.out.println("Enter Pursuing Year : ");
	                    String y = sc.next().toUpperCase();
	                    student.setYear(y);
	    	        	System.out.println(student);
	                    System.out.println("Successfully Updated Pursuing Year");
	                    break;
	                case 6:
	                    System.out.println("Exiting");
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid Choice");
	            }
	            return;
	        }
	    }
	    if(flag==0) {
	    	    System.out.println("No records found");
	        
	    }
	}


	private void search1 () {
		System.out.println("Enter Value to Search :");
		String v1 =sc.next();
		for(Student stud:stu ) {
		if(stud.getName().equalsIgnoreCase(v1)|| stud.getDept().equalsIgnoreCase(v1) || stud.getRegno().equalsIgnoreCase(v1) || stud.getGender().equalsIgnoreCase(v1)|| stud.getCgpa().equalsIgnoreCase(v1) || stud.getYear().equalsIgnoreCase(v1)) 
		{
			System.out.println(stud);
		}}}
	
	
	private void search2() {
System.out.println("Enter Value 1");
String v1=sc.next();
System.out.println("Enter Value 2");
String v2=sc.next();
for(Student stud:stu ) {
	if(stud.getName().equalsIgnoreCase(v1)|| stud.getDept().equalsIgnoreCase(v1) || stud.getRegno().equalsIgnoreCase(v1) || stud.getGender().equalsIgnoreCase(v1)|| stud.getCgpa().equalsIgnoreCase(v1) || stud.getYear().equalsIgnoreCase(v1)) 
	{ 
		if(stud.getName().equalsIgnoreCase(v2)|| stud.getDept().equalsIgnoreCase(v2) || stud.getRegno().equalsIgnoreCase(v2) || stud.getGender().equalsIgnoreCase(v2)|| stud.getCgpa().equalsIgnoreCase(v2) || stud.getYear().equalsIgnoreCase(v2)) {
			System.out.println(stud);
			}}
	}
}
	
	
	private void search3() {
		System.out.println("Enter Value 1");
		String v1=sc.next();
		System.out.println("Enter Value 2");
		String v2=sc.next();
		System.out.println("Enter Value 3");
		String v3=sc.next();
		for(Student stud:stu ) {
			if(stud.getName().equalsIgnoreCase(v1)|| stud.getDept().equalsIgnoreCase(v1) || stud.getRegno().equalsIgnoreCase(v1) || stud.getGender().equalsIgnoreCase(v1)|| stud.getCgpa().equalsIgnoreCase(v1) || stud.getYear().equalsIgnoreCase(v1)) {
				if(stud.getName().equalsIgnoreCase(v2)|| stud.getDept().equalsIgnoreCase(v2) || stud.getRegno().equalsIgnoreCase(v2) || stud.getGender().equalsIgnoreCase(v2)|| stud.getCgpa().equalsIgnoreCase(v2) || stud.getYear().equalsIgnoreCase(v2)) { 
					if(stud.getName().equalsIgnoreCase(v3)|| stud.getDept().equalsIgnoreCase(v3) || stud.getRegno().equalsIgnoreCase(v3) || stud.getGender().equalsIgnoreCase(v3)|| stud.getCgpa().equalsIgnoreCase(v3) || stud.getYear().equalsIgnoreCase(v3)) {
						System.out.println(stud);
					}}}
			
				}
		}
	
	
	private void search() {
		System.out.println("---------- SEARCH RECORDS  ----------");
	System.out.println("1.Search by 1 value \n2.Search by 2 values \n3.Search by 3 values\n4.Exit");
int choice=sc.nextInt();
	switch (choice) {
	case 1 :
		search1();
		break;
	case 2: 
		search2();
		break;
	case 3:
		search3();
		break;
	case 4:
		System.out.println("Exiting...");
		default : 
			System.out.println("Invalid Choice");
	}}}


