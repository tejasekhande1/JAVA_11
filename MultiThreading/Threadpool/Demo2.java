// METHODS OF THREADGROUP : 
// 1) ThreadGroup tg = new ThreadGroup("MyGroup")
// 2) ThreadGroup tg = new ThreadGroup("MyGroup","one")

class ThreadDemo extends Thread{

	ThreadDemo(ThreadGroup tg,String tName){
		super(tg,tName);             // to pass value to thread class
	}

	public void run(){
		System.out.println(Thread.currentThread().getName());
		task();
	}

	void task(){
		try{
			Thread.sleep(3000);
		} catch(InterruptedException ie){
			System.out.println("Interrupt Alay");
		}
	}
}

class ThreadGroupDemo{
	public static void main(String[] args){

		ThreadGroup tg1 = new ThreadGroup("ParentGroup");

		ThreadDemo t1 = new ThreadDemo(tg1,"One");
		ThreadDemo t2 = new ThreadDemo(tg1,"Two");
		ThreadDemo t3 = new ThreadDemo(tg1,"Three");

		t1.start();
		t2.start();
		t3.start();

		System.out.println(tg1.activeCount());

		tg1.interrupt();
		tg1.distroy();
	}
}
