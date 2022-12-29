
interface MumbaiMarket{

	default void quality(){                              
		System.out.println("Best Quality");
	}

	void prize();
}

class SunilShop implements MumbaiMarket{

	public void prize(){
		System.out.println("500-600");
	}
}

class TilakRoadShop implements MumbaiMarket{

	public void prize(){
		System.out.println("800-900");
	}
}

class Customer{
	public static void main(String[] args){
	
		SunilShop obj = new SunilShop();
		obj.prize();
		obj.quality();	
	
		TilakRoadShop obj2 = new TilakRoadShop();
		obj2.prize();
		obj2.quality();	
	}
}
