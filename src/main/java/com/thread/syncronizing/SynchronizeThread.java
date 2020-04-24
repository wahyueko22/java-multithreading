package com.thread.syncronizing;

import java.util.concurrent.atomic.AtomicInteger;

class SynchronizeObject implements Runnable{

	private int counter;
	
		public void increment() {
			try {
	            Thread.sleep(100);
	        } catch (InterruptedException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
			counter ++;
		}

	public void decrement() {
		counter --;
	}

	public int getValue() {
		return counter;
	}

	public synchronized  void run() {
		// TODO Auto-generated method stub
		this.increment();
		System.out.println("Value After increment " + Thread.currentThread().getName() + " = " + this.getValue());
		// decrementing
		this.decrement();
		System.out.println("Value for Thread at last " + Thread.currentThread().getName() + " = " + this.getValue());

	}

}

public class SynchronizeThread {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SynchronizeObject counter = new SynchronizeObject();
		Thread t1 = new Thread(counter, "SynchronizeThread-1");
		Thread t2 = new Thread(counter, "SynchronizeThread-2");
		Thread t3 = new Thread(counter, "SynchronizeThread-3");
		Thread t4 = new Thread(counter, "SynchronizeThread-4");
		Thread t5 = new Thread(counter, "SynchronizeThread-5");
		Thread t6 = new Thread(counter, "SynchronizeThread-6");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
	}
}
