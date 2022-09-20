
public class Wovels1 {

	public static void main(String[] args) {
	
		String name = "I love India";
		String name1 = name.toLowerCase();
		System.out.println(name);
		char[] chararray = name1.toCharArray();
		int count=0;
		
		for(int i=0; i<=name1.length()-1; i++) {
			
			if(name1.charAt(i)=='a'||name1.charAt(i)=='e'||name1.charAt(i)=='o'
					||name1.charAt(i)=='i'||name1.charAt(i)=='u') {
				chararray[i]='*';
				count++;
			}
		}
		System.out.println(count);
		System.out.println(chararray);
	}
}
