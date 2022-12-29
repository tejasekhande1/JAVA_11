// newFixedThreadPool(10)  (10--->number of thread -----> method in executor class) ---> return type is ExecutorService
// newCachedThreadPool()   (200 thread banvla tr server te pelau shakto ka...mhnun use karu naye) 
// newSingleThreadExecutor() (Single thread work on all thread one by one)

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadExeDemo implements Runnable{
	public void run(){
		System.out.println();
	}
}

class MyThreadExecutor{
	public static void main(String[] args){
		ExecutorService exec = Executors.newFixedThreadPool(10);

		for(int i=0 ; i<10 ; i++){
			ThreadExeDemo work = new ThreadExeDemo("" + i);
			exec.execute(work);
		}
	}
}
