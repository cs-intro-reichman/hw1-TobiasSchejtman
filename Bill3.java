// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		
	    String Name1 = args[0];
		String Name2 = args[1];
		String Name3 = args[2];
		int bill = Integer.parseInt(args[3]);

		double splitBill = Math.ceil((double)bill / 3);


		System.out.println("Dear " + Name3 + ", " + Name2 + ", and " + Name1 + ": pay " + splitBill + " Shekels each.");

	
	}
}
