
public class DuplicateArray2 {

	public static void main(String[] args) {
		
		int[] array = {10,20,30,30,20,70,10,50,40,50,80,80};
		int[] freq = new int[array.length];
		for(int i=0; i<array.length;i++) {
			int no=array[i];
			int count=1;
			for(int j=i+1; j<array.length;j++) {
				if(no==array[j]) {
					count++;
					freq[j]=-1;
				}
				if(freq[i]!=-1) {
					freq[i]=count;
				}
			}
		}
		int countOfDup=0;
		int uniqueNos=0;
		for(int i=0; i<freq.length;i++) {
			if(freq[i]>1) {
				countOfDup++;
			}
			if(freq[i]!=-1) {
			System.out.println(array[i]+" appeared "+freq[i]+" times");
			}
			}
		System.out.println("total duplicates are: "+countOfDup);
		for(int i=0; i<freq.length;i++) {
			if(freq[i]==1) {
				uniqueNos++;
			System.out.println("unique numbers is: "+array[i]);
			}
		}
		System.out.println("total unique numbers are: "+uniqueNos);
		
	}
	}