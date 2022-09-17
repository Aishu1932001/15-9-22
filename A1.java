package com.thread.com;

public class A1 extends Thread{

	
	Demo obj;
	A1(Demo obj){
		this.obj=obj;
	}
	
	@Override
	public void run() {
		obj.method1();
	}
	}
	