
// this$0 is not present in bytecode ; this$0 => putfield line sangte kontya class chya object var inner class call kela ahe 

class PlayBooks{
	static class Books{                                                // PARENT CLASS IS OBJECT CLASS
		void orderBooks(){
			System.out.println("From Book Store");
		}
	}
}

class OrderBooks{
	public static void main(String[] args){
		new PlayBooks.Books().orderBooks();
	}
}
