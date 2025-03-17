package com.vaishnavi;

public class collegestudentdata {
	
	 String clgName="ABC College";
	 String principleName;
	 int estYear;
	 
	 
	 int studentld;
	 String name ;
	 long mobile;
	 char gender;
	 int YearOFDOB;
	 int marks;
	 double avgOFMarks;
	 
	 
	 public static void main(String[] ar) {
		 collegestudentdata s1 = new collegestudentdata(); 
		 collegestudentdata s2 = new collegestudentdata(); 
		 collegestudentdata s3 = new collegestudentdata(); 
		 
		 System.out.println(s1.clgName); 
		 System.out.println(s1.principleName); 
		 System.out.println(s1.estYear); 
		 System.out.println(s1.studentld); 
		 System.out.println(s1.name); 
		 System.out.println(s1.mobile); 
		 System.out.println(s1.gender); 
		 System.out.println(s1.YearOFDOB);
		
		 System.out.println(s1.marks); 
		 System.out.println(s1.avgOFMarks); 
		 
		 s1.studentld=190;
		 System.out.print("****");
		 System.out.println(s1.studentld);


	}

}
