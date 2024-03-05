package project;

import java.util.Calendar;
import java.util.Scanner;

public class admission_management_System {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        int last = currentYear % 100;
        String year = "2k" + last;
        System.out.println("Current Year: " + year);

        String eledept;

        admission_model am = new admission_model();

        Scanner sc = new Scanner(System.in);
        admission_model[] arr = new admission_model[240];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the Following Details for Candidate " + (i + 1));
            System.out.println("Name :");
            String n = sc.next();
            System.out.println("Phone No :");
            String ph = sc.next();
            System.out.println("Prefered Dept :");
            String dep = sc.next();
            System.out.println("HSC Marks :");
            int mk = sc.nextInt();
            arr[i] = new admission_model(n, ph, dep, mk);
        }
int itreg =101;
int csereg =101;
int eeereg =101;
int ecereg =101;

        int flag=0;
        for (int j = 0; j < 3; j++) {
            int mk = arr[j].getMarks();
            if (mk > 60) {
                if (mk >= 60 && mk <= 70) {
                    arr[j].setEledept("ECE");
                    flag = 4;
                } else if (mk > 70 && mk <= 80) {
                    arr[j].setEledept("EEE");
                    flag = 3;
                } else if (mk > 80 && mk <= 85) {
                    arr[j].setEledept("CSE");
                    flag = 2;
                } else if (mk > 85) {
                    arr[j].setEledept("IT");
                    flag = 1;
                } else if (mk > 100) {
                    System.out.println("Invalid Input");
                }
            } else {
                arr[j].setEledept("NOT ELIGIBLE FOR ADMISSION");
            }
            

            if (flag != 0) {
                int reg=100;
                System.out.println("------------------------------------------");
                switch (flag) {
                    case 1:
                    	
                        System.out.println("Reg No: " + year + "IT" + itreg++);
                    
                    	break;
                    case 2:
                        System.out.println("Reg No: " + year + "CSE" + csereg++);
                        break;
                    case 3:
                        System.out.println("Reg No: " + year + "ECE" + ecereg++);
                        break;
                    case 4:
                        System.out.println("Reg No: " + year + "EEE" + eeereg++);
                        break;
                }
                System.out.println("Student Name: " + arr[j].getName());
                System.out.println("Student HSC Marks: " + arr[j].getMarks());
                if (arr[j].getDept().equals(arr[j].getEledept())) {
                    System.out.println("You are Eligible to Choose " + arr[j].getEledept());
                    System.out.println("------------------------------------------");

                } else {
                	System.out.println("You have chosen " + arr[j].getDept() + " but you are eligible to choose " + arr[j].getEledept());
                    System.out.println("------------------------------------------");

                }
            }
        }
    }
}
