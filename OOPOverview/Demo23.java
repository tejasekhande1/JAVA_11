/* Interface : interface cha object banvata yet nahi saglya method abstract astat ; interface lihila tr abstract lihaychi garaj padat nahi.....samja ekhada method la body dili tar error yeto.....methods chya agodr by default public abstract yete......interface kade constructor nasto.....kutla pan class interface kade parent mhnun yet nahi...ek interface dusrya interface la extends karu shkato....RealTime Example : Yevale Tea....
Interface mdhe jar method la body dyaychi asel tr default keyword use kela jato.....in Java versions above 1.7
*/

interface Yewale{
	default void creamRoll(){
		System.out.println("Yewale-CreamRoll");
	}

	void makingTea();               // public abstract by default yete
}

class PuneYewale implements Yewale{
	public void makingTea(){
		System.out.println("Start at 5 Am");
		System.out.println("Best Taste");
	}
}

class BaramatiYewale implements Yewale{                       // extends object class asto
	public void makingTea(){
		System.out.println("Start at 7 Am");
		System.out.println("Best Taste");
	}
}

class Client{
	public static void main(String[] args){
		Yewale y = new PuneYewale();
		y.makingTea();
		y.creamRoll();
		Yewale y1 = new BaramatiYewale();
		y1.makingTea();
	}
}
