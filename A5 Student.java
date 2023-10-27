

					/// assignments 5 - Student details
package week1.day1;

public class Student {
	 

String studentname;
int RollNo;
String CollegeName;
float markScored;
double cgpa;
	   

	

public static void main(String[] args) {
    	
        Student stu = new Student();
 stu.studentname= " Praveen";
 stu.RollNo= 123;
 stu.CollegeName= "BHC";
 stu.markScored=73;
 stu.cgpa= 7.3;

        System.out.println("Student Name: " + stu.studentname);
        System.out.println("Roll Number: " + stu.RollNo);
        System.out.println("College Name: " + stu.CollegeName);
        System.out.println("Marks Scored: " + stu.markScored);
        System.out.println("CGPA: " + stu.cgpa);
    }
    }



Output for our reference:

Student Name:  Praveen
Roll Number: 123
College Name: BHC
Marks Scored: 73.0
CGPA: 7.3
