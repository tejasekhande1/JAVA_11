class StringDemo{
	public static void main(String[] args){
	
		char[] name = {'t','e','j','a','s'};	
		
		String obj = new String(name);
		System.out.println(obj);

		byte barr[] = {100,101,102,103,104};
		String obj2 = new String(barr);
		System.out.println(obj2);
	}
}
