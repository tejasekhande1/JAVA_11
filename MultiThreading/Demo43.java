// THREAD CONTROLLING : 1] SLEEP() -----> Thread Class Method  ---> When Use sleep we should used throws InterruptedException

class SleepDemo extends Thread {
	public void run(){
		System.out.println("In Run");
	
		for(int i=0 ; i<10 ; i++){
			System.out.println("Child Thread");
			try{
				sleep(2000);
			} catch(InterruptedException ie){

			}
		}
	}
}

class ThreadDemo{
	public static void main(String[] args) throws InterruptedException{
		SleepDemo sd = new SleepDemo();
		sd.start();
		sd.sleep(2000);

		for(int i=0 ; i<10 ; i++){
			System.out.println("Main Thread");
		}
	}
}
