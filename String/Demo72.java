class ConcatDemo{
	public static void main(String[] args){
	
		String s1 = "Shashi";
		String s2 = "Bagal";

		System.out.println(s1+s2); // internally call StringBuilder and then use append method..because fast performing
	}
}
