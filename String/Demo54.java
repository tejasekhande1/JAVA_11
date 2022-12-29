// substring() ; toUppeCas() ; toLowerCase()

class StringDemo{
	public static void main(String[] args){
	
		String s1 = new String("Bielearn");
		String s2 = new String("BieMedia");
		String s3 = new String("BieTickets");

		System.out.println(s1.substring(3));     // learn          
		System.out.println(s1.substring(3,6));     // lea     
		
		System.out.println(s2.toUpperCase());     // BIEMEDIA     
		System.out.println(s2.toLowerCase());     // biemedia 

	}
}
