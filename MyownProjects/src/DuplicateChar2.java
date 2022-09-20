
public class DuplicateChar2 {

	public static void main(String[] args) {
		
		String str = "engineering";
		char[] ch=str.toCharArray();
		for(int i=0; i<str.length(); i++) {
			int count = 1;
			for(int j=i+1; j<str.length(); j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]='0';
				}
			}
				if(ch[i]!='0') {
					System.out.println(ch[i]+"-"+count);
				}
			
		}
	}
}
