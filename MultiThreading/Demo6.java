// THREADGROUP/THREADEXECUTER/THREADPOOL : USED IN BACKENDS
// DAEMON THREAD : REALTIME EXAM ---> HELPERS IN OFFICE : PRIORITY LOW : EXAMPLE ---> FINALIZER
// 		   NOT NEED TO USED IT BCOZ JVM ALREADY MADE THIS DEMAN THREADS IN INTERNALLY
//
// 		   jps -v ------> jstack deamonthreadnumber ----> See Running Thread

class DeamonThread extends Thread{
	public void run(){
		for(int i=0 ; i<5000 ;i++){
			try{
				sleep(5000);
			}catch(InterruptedException ie){

			}

			System.out.println(Thread.currentThread().getName());
		}
	}
}

class DeamonDemo{
	public static void main(String[] args){
		DeamonThread dt1 = new DeamonThread();
		DeamonThread dt2 = new DeamonThread();
		DeamonThread dt3 = new DeamonThread();

		dt1.start();
		dt2.start();
		dt3.start();
	}
}

// INTERVIEW QUESTION : HOW MANY THREADS ARE RUNNING WHEN WE CREATE ONE THREAD ?
// ANS --> THERE ARE 8-9 THREADS IN RUNNING SOME DEAMON THREADS ARE IN PROCESS
