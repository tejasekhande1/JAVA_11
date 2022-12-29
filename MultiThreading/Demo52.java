
// YEILD() ---> DAYALU MANAS ; JEVHA APAN MANDIRAT DARSHANALA LINE MADHE ASTO ANI JEVHA APLYA MAGACHA GHAIT ASTO TYALA PUDHE JAUN DETO ;

class MyThread extends Thread{
	public void run(){
		for(int i=0 ; i<10 ; i++){
			System.out.println("Child Thread");
		}
	}
}

class YieldDemo{
	public static void main(String[] args){
	
		MyThread mt = new MyThread();
		mt.start();
		
		mt.yield();

		for(int i=0 ; i<10 ; i++){
			System.out.println("Parent Thread");
		}
	}
}

// YEILD() VS JOIN() :
// 1] JOIN() : AFTER COMPLETING ALL WORK OF THREAD THEN EXECUTE ANOTHER REMAINING THREAD
// 2] TEILD() : SEARCHING SAME PRIORITY THREAD AND EXECUTE THEM ; NOT EXECUTE LESS PRIORITY THREADS
