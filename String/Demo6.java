// String Buffer : size already 16 byte memory dete....(code 29.30)
// CONSTRUCTOR : 1) StringBuffer() ; 2) StringBuffer(string) ; StringBuffer(int) ;

class StringDemo{
	public static void main(String[] args){
	
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());               // 16
		sb1.append("Core2web");
		sb1.append("Technologies");
		System.out.println(sb1.capacity());              // 34 internally expandCapacity() la call karto [ newcap = (oldcap*2) + 2 ];	

		StringBuffer sb2 = new StringBuffer("Shashi");
		System.out.println(sb2.capacity());               // 22        [ 16 + 6 = 22] 
	
		StringBuffer sb3 = new StringBuffer(500);
		System.out.println(sb3.capacity());              // 500            
	}
}

// identityhashcode hi object chi size dakhavto..but ti size confirm ahe assa nahi
