package com.thread.atomic;

import java.util.concurrent.atomic.AtomicInteger;

class AtomicThread implements Runnable{

	private AtomicInteger counter = new AtomicInteger(0);
	
	public void increment() {
		try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		counter.getAndIncrement();
	}

	public void decrement() {
		counter.getAndDecrement();
	}

	public AtomicInteger getValue() {
		return counter;
	}

	public void run() {
		// TODO Auto-generated method stub
		this.increment();
		System.out.println("Value After increment " + Thread.currentThread().getName() + " = " + this.getValue());
		// decrementing
		this.decrement();
		System.out.println("Value for Thread at last " + Thread.currentThread().getName() + " = " + this.getValue());

	}

}

public class ThreadAtomic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AtomicThread counter = new AtomicThread();
		Thread t1 = new Thread(counter, "AtomicThread-1");
		Thread t2 = new Thread(counter, "AtomicThread-2");
		Thread t3 = new Thread(counter, "AtomicThread-3");
		Thread t4 = new Thread(counter, "AtomicThread-4");
		Thread t5 = new Thread(counter, "AtomicThread-5");
		Thread t6 = new Thread(counter, "AtomicThread-6");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
	}
}
