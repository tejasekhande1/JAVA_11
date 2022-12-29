
// MULTITHREADING : JAVA IS THREADBASED LANGUAGE  ; ONE PROCESS MULTIPLE THREADS
// REAL TIME EXAMPLE : RIDING OUR BIKE (SEE,THINK,LEGS,HAND) ; WORKING OF ONE BRIDGE AT VARIOUS PLACE
// THREAD SCHEDULAR : SET PRIORITY TO THREADS
// IN MULTITHREADING WE SHOULD BE OVERRIDE/CREATE SELF RUN() METHOD

class ThreadDemo extends Thread{                                         // COMPULSORY

	public void run(){       						// OVERRIDED RUN() METHOD
		System.out.println("In Run Method");
		String tName = Thread.currentThread().getName();
		System.out.println("Thread Name : " + tName);
	}

	public static void main(String[] args){

		ThreadDemo obj = new ThreadDemo();
		obj.start();

		System.out.println("MultiThreading");
		String tName = Thread.currentThread().getName();
		System.out.println("Thread Name : " + tName);
	}
}

/* 
MultiThreading                         	DIFF OUTPUTS IN DIFF RUNS DUE TO PRIORITY CHANGE AT ANY TIME
In Run Method
Thread Name : main
Thread Name : Thread-0
*/

/*
DAIGRAM 11.12
NATIVE : C/C++ METHOD
*/
