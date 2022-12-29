class Core2web{
	static int totalStudCount = 2500 ;
	int batchStudCount = 0 ;

	void dispStudCount(){
	System.out.println("totalStudCount = "+totalStudCount);
	System.out.println("batchStudCount = "+batchStudCount);
	}
}

class C2WAppAdmin {
	static int totalLoginCount = 1200 ;
	int videoCount = 200 ;

	void dispStat(){
	System.out.println("Total Login Count = " +totalLoginCount);
	System.out.println("Total Video Count = " +videoCount);
	}
}

class Mentor{
	public static void main(String[] args){
		Core2web java9_10 = new Core2web();
		java9_10.batchStudCount = 370 ;
		java9_10.dispStudCount();

		Core2web ppa5 = new Core2web();
		ppa5.batchStudCount = 290 ;
		ppa5.dispStudCount();

		C2WAppAdmin python0 = new C2WAppAdmin();
		python0.videoCount = 25 ;
		python0.totalLoginCount = 1000 ;
		python0.dispStat();

		C2WAppAdmin OS = new C2WAppAdmin();
		OS.videoCount = 150;
		OS.dispStat();
	}
}
