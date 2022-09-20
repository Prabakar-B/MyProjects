
public class Smallest {

	public static void main(String[] args) {
		int[] given = {2,3,4,5,6};
		int smallest = Integer.MAX_VALUE;
			for(int i=0; i<=given.length-1;i++) {
				if(given[i]<smallest) {
					smallest=given[i];
				}
			}
			System.out.println("the smallest is: "+smallest);
	}
}
