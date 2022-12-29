class Demo{
	public static void main(String [] args){
		int floor = 1 ;
			switch(floor){
				case 1 :
					{
						char ch = 'S';
						       switch(ch){
								case 'S' :
								case 's' :
									System.out.println("Shopping");
									break;

								case 'F' :
								case 'f' :
									System.out.println("Food");
									break;

								default :
									System.out.println("Service Not Available");
									break;
						       }	       
					}
					break ;

				case 2 :
						char ch = 'M';
						       switch(ch){
								case 'M' :
								case 'm' :
									System.out.println("Movie");
									break;

								case 'P' :
								case 'p' :
									System.out.println("Play Station");
									break;

								default :
									System.out.println("Service Not Available");
									break;
						    }
				 	break ;		
					
				default :
					System.out.println("Service is Not Available");
					break ;
			}
	}
}
