// String Constructor : StringBuffer(int)

class StringDemo{
	public static void main(String[] args){

		StringBuffer sb1 = new StringBuffer("Shashi");
		StringBuffer sb2 = new StringBuffer("Core2Web");
	
		System.out.println(sb1.length());		// 6
		System.out.println(sb1.capacity());		// 22

		System.out.println(sb1.charAt(3));            // s
		System.out.println(sb1.append(" Bagal"));	// Shashi Bagal
	
		System.out.println(sb1.append(28));	// Shashi Bagal28
		System.out.println(sb1.append(sb2));	// Shashi Bagal28Core2Web

		sb1.insert(14,"Biencaps");
		System.out.println(sb1);	// Shashi Bagal28BiencapsCore2Web

		sb1.deleteCharAt(12);
		System.out.println(sb1);	// Shashi Bagal8BiencapsCore2Web
	
		sb1.delete(6,12);
		System.out.println(sb1);

		sb2.reverse();
		System.out.println(sb2);         // beW2reoc
	
		sb2.reverse();
		System.out.println(sb2);         // Core2Web

		sb2.setLength(6);
		System.out.println(sb2);         // Core2W
	}
}

// METHOD OVERLOADING : IN SAME CLASS SAME FUNCTIION BUT DUFFERENT PARAMETER
