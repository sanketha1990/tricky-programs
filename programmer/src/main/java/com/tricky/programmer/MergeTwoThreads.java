package com.tricky.programmer;

public class MergeTwoThreads {

	public static void main(String[] args) {
		MergeTwoThreads mt = new MergeTwoThreads();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (this) {
					mt.odd();
					try { 
                        wait(); 
                    } 
                    catch ( 
                        InterruptedException e) { 
                        e.printStackTrace(); 
                    } 
					notify();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (this) {

					mt.even();
					try { 
                        wait(); 
                    } 
                    catch ( 
                        InterruptedException e) { 
                        e.printStackTrace(); 
                    } 
					notify();
				}
			}
		});

		t1.start();
		t2.start();

	}

	public void even() {
		int i = 2;
		while (i != 100) {
			System.out.println(i);
			i += 2;
		}
	}

	public void odd() {
		int i = 1;
		while (i != 99) {
			System.out.println(i);
			i += 2;
		}
	}

}
