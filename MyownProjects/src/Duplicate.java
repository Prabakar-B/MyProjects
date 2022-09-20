
public class Duplicate {

	public static void main(String[] args) {
		String name = "go to gym";
		char[] charArray = name.toCharArray();
		int count=0;
		for(int i=0; i<charArray.length;i++) {
			count=1;
				for(int j=i+1; j<charArray.length;j++) {
				if(charArray[i]==charArray[j]&&charArray[i]!=' ') {
					count++;
					charArray[j]='0';
				}
				}
				if(count>1&&charArray[i]!='0') {
				
					System.out.println(charArray[i]);
				
				}
			
		}
	}
}
