package com.thread.racecondition;

public class MainRace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadCounter counter = new ThreadCounter();
		Thread t1 = new Thread(counter, "Thread-1");
        Thread t2 = new Thread(counter, "Thread-2");
        Thread t3 = new Thread(counter, "Thread-3");
        Thread t4 = new Thread(counter, "Thread-4");
        Thread t5 = new Thread(counter, "Thread-5");
        Thread t6 = new Thread(counter, "Thread-6");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
	}

}
