
// t.start() la double call kela tr : 

class ThreadDemo extends Thread{
	public void run(){
		System.out.println("Thread Name : " + Thread.currentThread().getName());
	}
}

class RestartThread{
	public static void main(String[] args){
	
		ThreadDemo t = new ThreadDemo();
		t.start();
	
		System.out.println("Thread Name : " + Thread.currentThread().getName());
	//	t.start();                          IllegalThreadStateException
	}
}
