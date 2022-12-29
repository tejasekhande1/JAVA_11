// REPLACE : return type String

class StringDemo{
	public static void main(String[] args){
	
		String s1 = new String("Kanhaiya");
		System.out.println(s1);

		String s2 = s1.replace('a','p');        // a char replace by p  
		System.out.println(s2);                // Kpnhpiyp
	}
}
