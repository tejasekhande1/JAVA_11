
// METHOD LOCAL INNER CLASS : A CLASS WHICH IS EXIST IN METHOD ; EX : ZOMATO (CLASS) -----> ORDER (METHOD) -----> HOTELS (CLASS) ; 
// 			      OBJECT OF LOCAL INNER CLASS SHOULD BE CREATE IN THAT SPECIFIC METH
// 	STATIC METHOD MADHE INNER CLASS ACCESS HOTO ------> NON-STATIC VARIABLE ACCESS HONAR NAHIT ; NON-STATIC MADHE BOTH ACCESS HOTA

class Zomato{
	void order(){
	
		int x = 10;               // above 1.6 madhe access hoto but less than 1.6 la he var final karava lagta

		class Hotels{                                      // Zomato$1Hotels

			String hotelName = null ;

			Hotels(String hotelName){
				this.hotelName = hotelName ;
			}

			void orderPlaced(){
				System.out.println(x);
				System.out.println("Ordered Placed At Hotel : " +hotelName);
			}
		}

		Hotels h = new Hotels("GreenPark");
		h.orderPlaced();
	}

	public static void main(String[] args){
		Zomato z = new Zomato();
		z.order();

		new Zomato().order();
	}
}
