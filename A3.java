package com.thread.com;

public class A3 extends Thread{

	Demo obj;
	A3(Demo obj){
		this.obj=obj;
	}
	
	@Override
	public void run() {
		obj.method3();
	}
	 
	}

