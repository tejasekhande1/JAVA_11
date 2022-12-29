// DAIGRAM : 4:00
// JOIN() -----> THROWS INTERRUPTEDEXCEPTION ; THREAD COMPLETE HOI PARYANT MAZA KAAM THAMBAV ; DAIGRAM : 6:26 (REAL EXAMPLE)

class MyThread extends Thread{
	public void run(){
		for(int i=0 ; i<10 ; i++){
			System.out.println("Child Thread");
		}
	}
}

class JoinDemo{
	public static void main(String[] args) throws InterruptedException{
	
		MyThread mt = new MyThread();
		mt.start();
		mt.join();
	
		for(int i=0 ; i<5 ; i++){
			System.out.println("Main Thread");
		}
	}
}

// FIRST RUN/EXECUTION CHILD THREAD THEN AFTER COMPLETE PRINT MAIN THREAD ALSO WHEN USED SLEEP() IN IT.
