// newFixedThreadPool(10)  (10--->number of thread -----> method in executor class) ---> return type is ExecutorService
// newCachedThreadPool()   (200 thread banvla tr server te pelau shakto ka...mhnun use karu naye) 
// newSingleThreadExecutor() (Single thread work on all thread one by one)

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadExeDemo implements Runnable{
        String workNum = null ;
        ThreadExeDemo(String workNum){
                this.workNum = workNum ;
        }
        public void run(){
                System.out.println(Thread.currentThread().getName() + "Start Task : " + workNum);
        	workAssign();
		System.out.println(Thread.currentThread().getName() + "End Task");
        }
	void workAssign(){
		try{
			Thread.sleep(3000);
		} catch(InterruptedException ie){
			}
	}
}

class MyThreadExecutor{
        public static void main(String[] args){
                ExecutorService exec = Executors.newFixedThreadPool(10);
                for(int i=0 ; i<10 ; i++){     // try i<20 ; if one specific thread work complete then assign new work of that thread
                        ThreadExeDemo work = new ThreadExeDemo("" + i);
                        exec.execute(work);
                }
		exec.shutdown();
	}
}

// Servers Depends on Threadpool Executor like as AWS,Google Cloud
