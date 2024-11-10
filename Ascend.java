// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		
		int limit = Integer.parseInt(args[0]);
		
		int a = (int) (limit * Math.random());
		int b = (int) (limit * Math.random());
		int c = (int) (limit * Math.random());

		int max1 = Math.max(a,b);
		int max2 = Math.max(a,c);
		int max3 = Math.max(b,c);

		int min1 = Math.min(a,b);
		int min2 = Math.min(a,c);
		int min3 = Math.min(b,c);
		
		int maximum = Math.max(max1,c);
		int minimum = Math.min(min1,c);
		
		int mid1 = Math.min(max1,max2);
		int mid2 = Math.min(max2,max3);
		int middle = Math.min(mid1,mid2);

		System.out.println(minimum + " " + middle + " " + maximum);
	
		
	}
}
