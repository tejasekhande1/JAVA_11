
// Implements By Runable : THREAD CLASS IMPLEMENTS RUNNABLE

class MyThread implements Runnable{
	public void run(){
		System.out.println("In Run Method");
	}
}

class RunnableDemo{
	public static void main(String[] args){
		MyThread mt = new MyThread();          // MyThread ----> Target
		Thread t = new Thread(mt);
		t.start();
	}
}

/*	THREAD VS RUNNABLE :
 *	ACHIEVE MULTIPLE INTERITANCE WE SHOULD USE RUNNABLE : class MyThread extends Xyz implements Runnable ;
 *	IF ANY CLASS INHERITED TO ANOTHER MAIN CLASS THEN USE RUNNABLE
 *	AND IN NORMAL CONDITIONS USE THREAD
 */
