class Demo{
	public static void main(String [] args){

		short x = 100 ;              // replace short as byte

		switch(x){                  // byte ,short,int,char

			case 100 :
				System.out.println("First Case");
				break ;

			case 200 :
				System.out.println("Second Case");
				break ;

		}

	}

}

// Long,float,double la error yeatay
// short chi range 1-32767 and -32768
// byte ha 1-127 and -128 range paryant ahe so case 128 chya pudhe asel tr error deto (possible loosy conversiom)
