package com.thread.com;

public class A2 extends Thread {

	Demo obj;
	A2(Demo obj){
		this.obj=obj;
		
	}
	
	@Override
    public void run() {
    obj.method2();
    }
}
