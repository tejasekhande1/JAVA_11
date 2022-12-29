// Buffered Reader vs Scanner Class

/*
A] Buffered Reader ---->
	1) Package : io
	2) read and Manually parse
	3) buffer size 8  kb
	4) Default method is String
	5) More usefull in MultiThreading
	6) Process is faster than Scanner class
	7) Buffered Reader is Synchronized

B] Scanner Class ---->
	1) Package : util
	2) Read and Atomatically parse through next() method
	3) buffer size 1.0 kb
	4) method depend on user
	5) Scanner Class is not Synchronized

* Synchronized : One work handled by multiple threading ; i.e. two thread astil tr ekanae input magitl tr tyach thread la input dete
*/

class Demo extends Thread{
	void run(){
		System.out.println("In Run");
	}

	void fun(){
		System.out.println("In Fun");
	}

	public static void main(String[] args){
		
		Demo obj = new Demo();

		obj.fun();
		Thread t = new Thread();
		t.start();
		obj.fun();
		obj.fun();
	}
}
