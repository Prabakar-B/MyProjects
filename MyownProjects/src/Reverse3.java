import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Reverse3 {

	String name = "orange";
	
	public void method1() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(name);
		buffer.reverse();
		System.out.println(buffer);
		//System.out.println(this.name);
		StringBuilder builder = new StringBuilder();
		builder.append(name);
		builder.reverse();
		System.out.println(builder);
	}
	public void method2() {
		char[] charArray = name.toCharArray();
		for(int i=name.length()-1; i>=0; i--) {
			System.out.print(charArray[i]);
		}
	}
	public void method3() {
		char[] charArray = name.toCharArray();
		String rev = "";
		for(int i=name.length()-1; i>=0; i--) {
			rev=rev+charArray[i];
		}
		System.out.println("\n"+rev);
	}
	public void method4() {
		char[] charArray = name.toCharArray();
		List<Character> listarray = new ArrayList<Character>();
		for(Character forlist:charArray) {
			listarray.add(forlist);
		}
		Collections.reverse(listarray);
		ListIterator listiterate = listarray.listIterator();
		while(listiterate.hasNext()) {
			System.out.print(listiterate.next());
		}
	}

	public static void main(String[] args) {
		Reverse3 rev = new Reverse3();
		rev.method1();
		rev.method2();
		rev.method3();
		rev.method4();
	}
}
