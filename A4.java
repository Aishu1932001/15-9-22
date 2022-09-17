package com.thread.com;

public class A4 extends Thread{

	Demo obj;
	A4(Demo obj){
		this.obj=obj;
	}
	@Override
	public void run() {
		obj.method4();
	}

}
	


