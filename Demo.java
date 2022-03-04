package com.kiran.examples;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Box b1;
 b1=new Box(1, 2, 3);
 System.out.println("value of w in box is "+b1.w);
 System.out.println("value of h in box is "+b1.h);
 System.out.println("value  of d in box is "+b1.d);
 int z=b1.volume();
 System.out.println("volume of box  b1 is "+z);
Box b2; 
b2=new Box(5, 6, 7);
System.out.println("value of w in box b2 is "+b2.w);
System.out.println("value of h in box b2 is "+b2.h);
System.out.println("value  of d in box b2  is "+b2.d);
int vol=b2.volume();
System.out.println("valume of box b2 is "+vol);
	}

}
