
public class ReverseScentence2 {

	public void method1() {
		String name = "i love you all";
		String[] splitwords=name.split(" ");
		for(int i=splitwords.length-1;i>=0;i--) {
			System.out.print(splitwords[i]);
		}
	}
	public void method2() {
		String name = "i love you all";
		String[] splitwords = name.split(" ");
		String reverse = "";
		for(int i=splitwords.length-1; i>=0; i-- ) {
			reverse=reverse+splitwords[i]+" ";
		}
		System.out.println("\n"+reverse);
	}
	public static void main(String[] args) {
		ReverseScentence2 rS = new ReverseScentence2();
		rS.method1();
		rS.method2();
	}
}

