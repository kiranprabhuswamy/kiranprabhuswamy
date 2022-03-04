package com.kiran.examples;

public class Box {
	
		 int w,h,d;
		 Box(int x,int y,int z)
		 {
			 w=x;
			 h=y;
			 d=z;
		 }
		 int volume()
		 {
			 int l=w*h*d;
			 
			 return l;
		 }
}
