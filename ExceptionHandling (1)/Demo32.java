
// INTERRUPTED EXCEPTION :

class Demo{
	public static void main(String[] args){               // throws InterruptedException
	
		Thread t = new Thread();
		t.start();

		System.out.println("Core2web");
		t.sleep(5000);
	
		System.out.println("Biencaps");
	}
}
