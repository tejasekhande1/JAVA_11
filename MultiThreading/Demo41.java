// MULTIPLE THREAD :

class NewThread extends Thread{
	public void run(){
		System.out.println("Thread Name : " + Thread.currentThread().getName());
	}
}

class ThreadDemo extends Thread{
	public void run(){
		System.out.println("Thread Name : " + Thread.currentThread().getName());

		NewThread nt = new NewThread();
		nt.start();
	}
}

class MultipleThread{
	public static void main(String[] args){
	
		ThreadDemo t = new ThreadDemo();
		t.start();
	
		System.out.println("Thread Name : " + Thread.currentThread().getName());
	
		ThreadDemo t1 = new ThreadDemo();
		t1.start();
	
		System.out.println("Thread Name : " + Thread.currentThread().getName());
	}
}
