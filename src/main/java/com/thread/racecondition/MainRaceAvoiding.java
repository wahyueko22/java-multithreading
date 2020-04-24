package com.thread.racecondition;

//to avoid race contion create new object each thread
public class MainRaceAvoiding {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadCounter counter = new ThreadCounter(); //new object
		ThreadCounter counter1 = new ThreadCounter(); //new object
		ThreadCounter counter2 = new ThreadCounter(); //new object
		ThreadCounter counter3 = new ThreadCounter(); //new object
		ThreadCounter counter4 = new ThreadCounter(); //new object
		Thread t1 = new Thread(counter, "Thread-1");
        Thread t2 = new Thread(counter1, "Thread-2");
        Thread t3 = new Thread(counter2, "Thread-3");
        Thread t4 = new Thread(counter3, "Thread-4");
        Thread t5 = new Thread(counter4, "Thread-5");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
	}
}
