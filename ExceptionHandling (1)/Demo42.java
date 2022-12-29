
class TryRuntimeDemo{

	int x = 10 ;

	public static void main(String[] args){

		try{
			TryRuntimeDemo obj = null ;
			System.out.println(obj.x);

		} catch(Exception ref){  	

			System.out.println("Exception handles");

		}
	}
}
