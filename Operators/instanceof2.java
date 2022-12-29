class Football{

}

class Cricket{
	public static void main(String [] args){
		Cricket T20 = new Cricket();
		Cricket Test = new Cricket();
		Football fmatch = new Football();

		System.out.println(T20 instanceof Object);            // true
		System.out.println(fmatch instanceof Object);	      // true
	}

}

// Notes : instance of chya left side la compulsory reference and object lagto ; Cricket obj = null -----> reference
