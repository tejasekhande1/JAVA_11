
class ThreadDemo extends Thread{

	public void run(){
		System.out.println(Thread.currentThread().getName());                  // Thread-0 then Shashi
		System.out.println(Thread.currentThread().getPriority());		 
		for(int i=0 ; i<5 ; i++){
			System.out.println("Core2Web");
		}
	}
	
	public void run(int x){
		System.out.println(Thread.currentThread().getName());                  // main
		for(int i=0 ; i<5 ; i++){
			System.out.println("Incubator");
		}
	}

/*	public void start(){
		System.out.println(Thread.currentThread().getName());                  // main
		System.out.println("My Start");                
	}   */
}

class ThreadScenario{
	public static void main(String[] args){
	
		ThreadDemo t = new ThreadDemo();                               // thread create karato
		t.start();							// thread work la start karatoo	
		t.setName("Shashi");
		t.setPriority(7);
//		t.run(1);
	
		System.out.println(Thread.currentThread().getName());		      // main
		System.out.println(Thread.currentThread().getPriority());		 
	
		for(int i=0 ; i<5 ; i++){
			System.out.println("Biencaps");
		}
	}
}

// t.run() => thread create zala asta pn start method la call nahi karat...ani mg main thread ch tya run method nech call hoil
// run() method overload keli tar self call karava lagel ani tithe main thread work karen
// apan jar start() method create keliye tar toh aplya start() method la call karto
// THREAD CYCLE DAIGRAM 40:51
// PRIORITY JAR NEGATIVE VALUE DILI TAR RUN TIME LA ERROR YETOOO ; PRIORITY 10 PARAYANTCH DETA YETE
