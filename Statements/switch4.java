class Demo{
	public static void main(String [] args){
		String x = "Shashi" ;             // String x = new String("Shashi");

		switch (x){

			case "Shashi" :
				System.out.println("Camel Case");
				break ;
			case "shashi" :
				System.out.println("Small Case");
				break ;
		}
	}
}

// Output : Camel Case because java is case sensetive language
