
// FIRST COMPLETE EXECUTION OF MAIN THREAD THEN ANOTHER :

class MyThread extends Thread{

	static Thread mainThread = null ;

	public void run(){
		try{
			mainThread.join();
		} catch(InterruptedException ie){

		}
	
		for(int i=0 ; i<5 ; i++){
			System.out.println("Child Thread");
		}

		//	System.out.println(mainThread.getName());
	}
}

class JoinDemo{
	public static void main(String[] args){
		MyThread mt = new MyThread();
		mt.start();

		MyThread.mainThread = Thread.currentThread();

		for(int i=0 ; i<10 ; i++){
			System.out.println("Parent Thread");
		}
	}
}

// DEADLOG SCENARIO : CODE RUN BUT NO OUTPUT
// 1] WHEN TWO THREADS APPLY JOIN() ON EACHOTHER    
// 2] WHEN ONE THREAD APPLY JOIN() ON ITSELF
