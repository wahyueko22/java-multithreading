package com.thread.racecondition;

public class ThreadCounter implements Runnable {

	private int counter;
	
	public void increment() {
		try {
            Thread.sleep(100);
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
