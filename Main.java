package com.thread.com;

public class Main {

	public static void main(String[] args) {
		
		Demo demo=new Demo();
		A1 a1=new A1(demo);
		
		A2 a2=new A2(demo);
		
		A3 a3=new A3(demo);
		
		A4 a4=new A4(demo);
		
		a1.start();
		a1.interrupt();
		
		a2.start();
		a2.interrupt();
		
		a3.start();
		a4.start();
	}
}
