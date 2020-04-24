package com.thread.volatilevar;

class VolatileThread implements Runnable{

	private volatile int counter;
	
	public void increment() {
		try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		counter++;
	}

	public void decrement() {
		counter--;
	}

	public int getValue() {
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

public class ThreadVolatile {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VolatileThread counter = new VolatileThread();
		Thread t1 = new Thread(counter, "Thread-1");
		Thread t2 = new Thread(counter, "Thread-2");
		Thread t3 = new Thread(counter, "Thread-3");
		Thread t4 = new Thread(counter, "Thread-4");
		Thread t5 = new Thread(counter, "Thread-5");
		Thread t6 = new Thread(counter, "Thread-6");
		t1.start();
		t2.start();
		
		try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		
		t3.start();
		t4.start();
		
		try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		t5.start();
		t6.start();
	}
}
