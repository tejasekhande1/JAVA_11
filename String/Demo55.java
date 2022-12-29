// String Buffer : String only heap var jate ; new ne object banvava lagto fkt ; String immutable mhnun performence down hoto mhnun StringBuffer ala ;

class StringDemo{
	public static void main(String[] args){
	
		StringBuffer sb1 = new StringBuffer("Pune");
		StringBuffer sb2 = new StringBuffer("Aurangabad");
		StringBuffer sb3 = new StringBuffer("Akole");

		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb3);

		sb1.append("Core2Web");
		sb2.append("Devgiri");
		sb3.append("Bhandardara");

		System.out.println(sb1);      // PuneCore2Web
		System.out.println(sb2);      // AurangabadDevgiri	
		System.out.println(sb3);      // Bhandardara
	}
}
