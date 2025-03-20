package com.vaishnavi;

public class MethodsDemoOne {
	
	public static void main(String[] args) 
	{	int a=10;
	int b=20;
	System.out.println(a+b);
	addition();//calling method addition
}

public static int addition() {
	int x=30;
	int y=40;
	int result=x+y;
	System.out.println(result);
	return 40;
}
}